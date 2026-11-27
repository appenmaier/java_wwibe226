package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Demo 27: explores selected parts of the Java API — system properties, elapsed-time measurement,
 * and the {@link java.time} date and time classes.
 */
public class D27_JavaApi {

   public static void main(String[] args) {
      /* System Properties */
      System.out.println("File Separator: " + System.getProperty("file.separator"));
      System.out.println("User Work Directory: " + System.getProperty("user.dir"));
      System.out.println("User Home Directory: " + System.getProperty("user.home"));

      /* Performance Measurement */
      long start = System.currentTimeMillis();

      // Do some lightweight work so there is something to measure
      long sum = 0;
      for (int i = 0; i < 1_000_000; i++) {
         sum += i;
      }

      long end = System.currentTimeMillis();

      System.out.println("sum: " + sum);
      System.out.println("elapsed time in ms: " + (end - start));

      /* Date and Time */
      LocalDateTime now = LocalDateTime.now();
      LocalDateTime birthdate = LocalDateTime.of(1982, 1, 4, 4, 30, 55);

      LocalDate examDate = LocalDate.parse("2026-12-21");
      LocalTime examTime = LocalTime.parse("09:00:00");

      int hour = now.getHour();
      int dayOfYear = now.getDayOfYear();
      Month month = now.getMonth();

      System.out.println("hour: " + hour);
      System.out.println("dayOfYear: " + dayOfYear);
      System.out.println("month: " + month);

      System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
      System.out.println(birthdate);
      System.out.println(examDate);
      System.out.println(examTime);
   }

}
