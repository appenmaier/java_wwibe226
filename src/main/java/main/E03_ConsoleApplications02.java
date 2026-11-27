package main;

import java.util.Scanner;

/**
 * Exercise 03: reads two integers from the console and prints what percentage the first is of the second.
 */
public class E03_ConsoleApplications02 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int a, b;
      double result;

      System.out.print("Please enter an integer: ");
      a = scanner.nextInt();

      System.out.print("Please enter another integer: ");
      b = scanner.nextInt();

      // Casting to double forces floating-point division so the fractional part is preserved
      result = (double) a * 100 / b;

      // Two ways to print the result: unformatted (shows all decimals) vs. formatted (rounded to 2)
      System.out.println("Result: " + a + " of " + b + " is " + result + "%");
      System.out.printf("Result: %d of %d is %.2f%%%n", a, b, result);
   }

}
