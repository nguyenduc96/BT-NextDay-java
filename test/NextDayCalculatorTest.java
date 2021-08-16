import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    public void testNextDayOfDay1Month1() {
        String date = "2021-01-01";
        LocalDate expected = LocalDate.parse("2021-01-02");

        LocalDate nextDay = NextDayCalculator.nextDay(date);
        assertEquals(expected, nextDay);
    }

    @Test
    public void testNextDayOfDay28Month2LeapYear() {
        String date = "2020-02-28";
        LocalDate expected = LocalDate.parse("2020-02-29");

        LocalDate nextDay = NextDayCalculator.nextDay(date);
        assertEquals(expected, nextDay);
    }

    @Test
    public void testNextDayOfDay28Month2() {
        String date = "2021-02-28";
        LocalDate expected = LocalDate.parse("2021-03-01");

        LocalDate nextDay = NextDayCalculator.nextDay(date);
        assertEquals(expected, nextDay);
    }

    @Test
    public void testNextDayOfDay31Month12() {
        String date = "2021-12-31";
        LocalDate expected = LocalDate.parse("2022-01-01");

        LocalDate nextDay = NextDayCalculator.nextDay(date);
        assertEquals(expected, nextDay);
    }

    @Test
    public void testNextDayOfDay30Month4() {
        String date = "2021-04-30";
        LocalDate expected = LocalDate.parse("2021-05-01");

        LocalDate nextDay = NextDayCalculator.nextDay(date);
        assertEquals(expected, nextDay);
    }
}