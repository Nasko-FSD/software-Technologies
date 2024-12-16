import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class CountWorkingDaysThirdSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String format = "dd-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        LocalDate startDate = LocalDate.parse(input.readLine(), formatter);
        LocalDate endDate = LocalDate.parse(input.readLine(), formatter);

        List<LocalDate> holidays = Arrays.asList(
                LocalDate.of(2000, 1, 1),
                LocalDate.of(2000, 3, 3),
                LocalDate.of(2000, 5, 1),
                LocalDate.of(2000, 5, 6),
                LocalDate.of(2000, 5, 24),
                LocalDate.of(2000, 9, 6),
                LocalDate.of(2000, 9, 22),
                LocalDate.of(2000, 11, 1),
                LocalDate.of(2000, 12, 24),
                LocalDate.of(2000, 12, 25),
                LocalDate.of(2000, 12, 26)
        );

        int workingDays = 0;

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                continue;
            }

            LocalDate holidayCheck = LocalDate.of(2000, date.getMonthValue(), date.getDayOfMonth());

            if (holidays.contains(holidayCheck)) {
                continue;
            }

            workingDays++;
        }
        System.out.println(workingDays);
    }
}
