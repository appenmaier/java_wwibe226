package main;

import java.util.Scanner;

/**
 * Demo 13: Demonstrates loop control with {@code continue} to skip characters and {@code break} to
 * find the first occurrence of a character in a string.
 */
public class D13_LoopControl {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input text: ");
      String text = scanner.nextLine();

      System.out.print("Input character: ");
      char searchChar = scanner.next().charAt(0);

      /* continue: skips the current iteration and moves to the next one */
      for (int i = 0; i < text.length(); i++) {
         char currentChar = text.charAt(i);
         if (currentChar == searchChar) {
            continue;
         }
         System.out.print(currentChar);
      }

      System.out.println();

      /* break: exits the loop immediately when the character is found */
      int firstOccOfSearchChar = 0;
      for (int i = 0; i < text.length(); i++) {
         char character = text.charAt(i);
         if (character == searchChar) {
            firstOccOfSearchChar = i;
            break;
         }
      }
      System.out.println(firstOccOfSearchChar);
   }

}
