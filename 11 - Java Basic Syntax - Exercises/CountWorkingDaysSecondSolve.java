import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CountWorkingDaysSecondSolve {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date startDate = format.parse(input.readLine());
        Date endDate = format.parse(input.readLine());

        int workingDays = 0;

        Calendar calendar =  Calendar.getInstance();

        while (startDate.compareTo(endDate) != 1) {
            calendar.setTime(startDate);
            boolean isHoliday = checkCurrentDay(startDate);

            if (isHoliday == false) {
                workingDays++;
            }

            calendar.add(Calendar.DAY_OF_MONTH, 1);
            startDate = calendar.getTime();
        }

        System.out.println(workingDays);
    }

    private static boolean checkCurrentDay(Date startDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);

        if (weekDay == Calendar.SATURDAY || weekDay == Calendar.SUNDAY) {
            return true;
        }

        int monthDay = calendar.get(Calendar.DAY_OF_MONTH);

        switch (calendar.get(Calendar.MONTH)) {



            case Calendar.JANUARY:
                if (monthDay == 1) {
                    return  true;
                }
                break;
            case Calendar.MARCH:
                if (monthDay == 3) {
                    return  true;
                }
                break;
                case Calendar.MAY:
                if (monthDay == 1 || monthDay == 24 || monthDay == 6) {
                    return  true;
                }
                break;
            case Calendar.SEPTEMBER:
                if (monthDay == 6 || monthDay == 22) {
                    return  true;
                }
                break;
            case Calendar.NOVEMBER:
                if (monthDay == 1) {
                    return  true;
                }
                break;
            case Calendar.DECEMBER:
                if (monthDay == 24 || monthDay == 25 || monthDay == 26) {
                    return  true;
                }
                break;
        }
        return  false;
    }
}
