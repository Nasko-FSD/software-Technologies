import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CountWorkingDays {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String startDateText = input.readLine();
        String endDateText = input.readLine();
        String format = "dd-MM-yyyy";

        LocalDate startDate = LocalDate
                .parse(startDateText, DateTimeFormatter.ofPattern(format));


        int[] holidayDays = {
          1, 3, 1, 6, 24, 6, 22, 1, 24, 25, 26
        };

        int[] holidayMonths = {
          1, 3, 5, 5, 5, 9, 9, 11, 12, 12, 12
        };

        LocalDate endDate = LocalDate
                .parse(endDateText, DateTimeFormatter.ofPattern(format));

        int totalDays = 0;

        for (LocalDate currentDate = startDate; currentDate.isBefore(endDate.plusDays(1)); currentDate = currentDate.plusDays(1)) {

            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
           int dayAsNumber = dayOfWeek.getValue();

            if (dayAsNumber == 6 || dayAsNumber == 7) {
                continue;
            }

            int month = currentDate.getMonthValue();
            int day = currentDate.getDayOfMonth();
            boolean isHoliday = false;

            for (int i = 0; i < holidayDays.length; i++) {
                if (holidayDays[i] == day && holidayMonths[i] == month) {
                    isHoliday = true;
                    break;
                }
            }

            if (isHoliday) {
                continue;
            }
            totalDays++;
        }
        System.out.println(totalDays);
    }
}
