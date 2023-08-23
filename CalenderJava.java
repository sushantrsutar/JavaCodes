import java.util.*;
public class CalenderJava {
    private static int august;

    public static void main(String[] args) {
       Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.getTimeZone());
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.HOUR));

        //printing today
        // Get an instance of the Calendar class representing the current date and time
        //Calendar cal = Calendar.getInstance();

        // Get the value of the day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println(dayOfWeek);

        // Array of day names, where index 0 corresponds to Sunday, index 1 to Monday, and so on
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Get the corresponding day name from the array using the dayOfWeek value
        String dayName = daysOfWeek[dayOfWeek -1];

        // Print the result indicating the current day of the week
        System.out.println("Today is " + dayName);
    }
}
