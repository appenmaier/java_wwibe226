package main;

import java.util.Scanner;

/**
 * Demo 12: demonstrates while, do-while, and for loops, including a practical do-while use case for
 * input validation and a for-loop use case for iterating over the characters of a string.
 */
public class D12_Loops {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Pre-Test Loop */
      int i = 1;
      while (i < 11) {
         System.out.println(i);
         i++;
      }

      System.out.println();

      /* Post-Test Loop */
      i = 1;
      do {
         System.out.println(i);
         i++;
      } while (i < 11);

      System.out.println();

      /* Index Loop */
      for (i = 1; i < 11; i++) {
         System.out.println(i);
      }

      System.out.println();

      /* Use Case for Post-Test Loop */
      Scanner scanner = new Scanner(System.in);

      int input;
      do {
         System.out.print("Input integer > 0: ");
         input = scanner.nextInt();

         if (input <= 0) {
            // System.err prints to the error stream, which is typically shown in red
            System.err.println("No, please try again");
         }
      } while (input <= 0);

      /* Use Case for Index Loop */
      String fullName = "Daniel Appenmaier";

      for (i = 0; i < fullName.length(); i++) {
         System.out.println(i + ": " + fullName.charAt(i));
      }
   }

}
