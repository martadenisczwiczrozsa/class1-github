package studyTime;

import java.sql.Time;
import java.time.Instant;
import java.time.LocalTime;


public class ExampleTime {

    public static void main(String[] args) {

        Time sqlTime1 = Time.valueOf("07:00:00");
        System.out.println(sqlTime1);


    }
}

