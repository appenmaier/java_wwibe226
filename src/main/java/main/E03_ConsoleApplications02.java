package main;

import java.util.Scanner;

/**
 * Exercise: reads two integers from the console and prints what percentage the first is of the second.
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

      // Integer division truncates; assigning to double preserves only the whole-number percentage
      result = a * 100 / b;

      System.out.println("Result: " + a + " of " + b + " is " + result + "%");
      System.out.printf("Result: %d of %d is %.2f%%%n", a, b, result);
   }

}
