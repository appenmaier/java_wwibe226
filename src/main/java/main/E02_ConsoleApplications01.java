package main;

import java.util.Scanner;

/**
 * Exercise: reads two integers from the console and prints their sum.
 */
public class E02_ConsoleApplications01 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int a, b, result;

      System.out.print("Please enter an integer: ");
      a = scanner.nextInt();

      System.out.print("Please enter another integer: ");
      b = scanner.nextInt();

      result = a + b;

      System.out.println("Result: " + a + " + " + b + " = " + result);
      System.out.printf("Result: %d + %d = %d%n", a, b, result);
   }

}
