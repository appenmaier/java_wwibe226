package main;

import java.util.Scanner;

/**
 * Demonstrates the conditional (ternary) operator as a compact alternative to an {@code if-else} branch.
 */
public class D10_ConditionalBranches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input age: ");
      int age = scanner.nextInt();

      String ageText;
      if (age >= 18) {
         ageText = "adult";
      } else {
         ageText = "minor";
      }
      System.out.println("ageText: " + ageText);

      // Ternary operator: condition ? valueIfTrue : valueIfFalse
      ageText = (age >= 18) ? "adult" : "minor";
      System.out.println("ageText: " + ageText);
   }

}
