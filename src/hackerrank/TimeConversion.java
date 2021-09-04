package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        String time = "12:52:15PM";
        String[] arr = time.split(":");

        String hour = arr[0];
        String minute = arr[1];
        String secondsAndSuffix = arr[2];

        String seconds = secondsAndSuffix.substring(0, 2);
        String suffix = secondsAndSuffix.substring(2, 4);

        int timeHour = Integer.parseInt(hour);

        timeHour = timeHour % 12;

        if (suffix.equals("PM")) {
            timeHour = timeHour + 12;
        }

        String resultTime = String.format("%02d", timeHour) + ":" + minute + ":" + seconds;

        System.out.print(resultTime);
    }
}
