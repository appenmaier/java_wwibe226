package main;

import java.util.Scanner;

/**
 * Demonstrates the difference between reference equality ({@code ==}) and value equality ({@code equals()}) for strings.
 */
public class D09_StringComparisons {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input \"true\": ");
      String input = scanner.next();

      // == compares object references, not string content — will almost always evaluate to false here
      if (input == "true") {
         System.out.println("Correct");
      } else {
         System.out.println("Incorrect");
      }

      // equals() compares string content — the correct way to compare strings
      if (input.equals("true")) {
         System.out.println("Correct");
      } else {
         System.out.println("Incorrect");
      }
   }

}
