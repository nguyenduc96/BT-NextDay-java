import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate nextDay(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.plusDays(1);
    }
}





