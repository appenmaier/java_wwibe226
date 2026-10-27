package main;

import java.util.Locale;

/**
 * Demonstrates formatted and unformatted console output using {@code print()}, {@code println()},
 * and {@code printf()}.
 */
public class D07_ConsoleOutputs {

   public static void main(String[] args) {
      /* print() and println() */
      System.out.println("Text 1");
      System.out.print("Text 2");
      System.out.print("Text 3");
      System.out.println("Text 4");

      System.out.println();

      /* printf() */
      // %[flags][width][.precision]conversion-character

      // String Format Rules
      String text = "Hello";
      String name = "Hans";

      System.out.printf("%s %s%n", text, name);
      System.out.printf("%S %S%n", text, name);
      System.out.printf("%20s %s%n", text, name);
      System.out.printf("%-20s %s%n", text, name);

      System.out.println();

      // Integer Format Rules
      System.out.println(1_000_000_000);
      System.out.printf("%,d%n", 1_000_000_000);
      System.out.printf(Locale.CHINA, "%,d%n", 1_000_000_000);

      System.out.println();

      // Decimal Number Format Rules
      System.out.printf("%.2f%n", 3.865329021);

      System.out.println();

      System.out.printf("| %-10s | %5s |%n", "Name", "Grade");
      System.out.printf("| ---------- | ----- |%n");
      System.out.printf("| %-10s | %5.1f |%n", "Hans", 5.0 / 3);
      System.out.printf("| %-10s | %5.1f |%n", "Peter", 3.184);
      System.out.printf("| %-10s | %5.1f |%n", "Anna", 2.7);
   }

}
