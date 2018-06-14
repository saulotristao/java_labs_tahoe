package part_03;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();
        System.out.println(timeZoneChange);

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;

        // Get the current second within the minute within the hour
        long secondsPerDay = 3600 * 24;
        long secondsPerHour = 3600;
        long secondsPerMinute = 60;

        long currentSecond = (totalSeconds % secondsPerMinute);
        System.out.println(currentSecond);
        // Get total minutes
        double currentMinutes = (totalSeconds % secondsPerHour);

        // Get the current minute in the hour
        long currentMinutes2 = (long)((currentMinutes/secondsPerHour) * secondsPerMinute);
        System.out.println(currentMinutes2);

        // Get the total hours
        double totalHours = (totalSeconds % secondsPerDay);
        long totalHours1 = (long) (totalHours / secondsPerHour);
        long totalHours2 = totalHours1 + timeZoneChange;
        boolean flag = true; // true is AM
        if (totalHours2 <0){
            totalHours2+=12;
            flag = false;
        }

        // Get the current hour

        System.out.println(totalHours1);
        System.out.println(totalHours2);

        // Display results using a 12 hour clock, include AM or PM
        String amOrPm = "";
        if (flag){
            amOrPm = "AM";
        }
        else {
            amOrPm = "PM";
        }
        System.out.println("it's  " + totalHours2 +":"+currentMinutes2+ ":"+currentSecond+ " "+ amOrPm);
    }
}
