package main;

import java.util.Scanner;

/**
 * Demonstrates reading various data types from the console using {@link Scanner}.
 */
public class D06_ConsoleInputs {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Initialize Scanner */
      Scanner scanner = new Scanner(System.in);

      /* Scan Input */
      System.out.print("Input integer: ");
      int int1 = scanner.nextInt();
      System.out.println("int1: " + int1);

      System.out.print("Input decimal number: ");
      double double1 = scanner.nextDouble();
      System.out.println("double1: " + double1);

      System.out.print("Input boolean: ");
      boolean boolean1 = scanner.nextBoolean();
      System.out.println("boolean1: " + boolean1);

      System.out.print("Input a single word: ");
      String string1 = scanner.next();
      System.out.println("string1: " + string1);

      System.out.print("Input a single character: ");
      char char1 = scanner.next().charAt(0);
      System.out.println("char1: " + char1);

      System.out.print("Input multiple words: ");
      // Consume the leftover newline from the previous nextBoolean()/next() call
      scanner.nextLine();
      String string2 = scanner.nextLine();
      System.out.println("string2: " + string2);
   }

}
