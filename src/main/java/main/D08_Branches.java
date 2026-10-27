package main;

import java.util.Scanner;

/**
 * Demonstrates simple and complex conditional branches using {@code if}, {@code else if}, and {@code else}.
 */
public class D08_Branches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input age: ");
      int age = scanner.nextInt();

      /* Simple Branch */
      // Logical Operators: && (logical and), || (logical or), ! (logical negation)
      // Comparison Operators: >, >=, <, <=, ==, !=
      if (age >= 18) {
         System.out.println("You are an adult");
      } else {
         System.out.println("You are a minor");
      }

      /* Complex Branch */
      if (age < 12) {
         System.out.println("You are a child");
      } else if (age < 18) {
         System.out.println("You are a teen");
      } else if (age < 65) {
         System.out.println("You are an adult");
      } else {
         System.out.println("You are a senior");
      }
   }

}
