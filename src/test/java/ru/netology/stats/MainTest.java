package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MainTest {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long bonus = service.calculate(amount, registered);
        System.out.println(bonus);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void testBonusService(int amount, boolean registered, int expected) {

        BonusService service = new BonusService();

        int bonus = (int) service.calculate(amount, registered);

        Assertions.assertEquals(expected, bonus);
    }


}