package main;

import java.util.Scanner;

/**
 * Demo 12: Demonstrates while, do-while, and for loops, including a practical do-while use case for
 * input validation and a for-loop use case for iterating over the characters of a string.
 */
public class D12_Loops {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Pre-Test Loop */
      int x = 1;
      while (x < 11) {
         System.out.println(x);
         x++;
      }

      System.out.println();

      /* Post-Test Loop */
      int z = 1;
      do {
         System.out.println(z);
         z++;
      } while (z < 11);

      System.out.println();

      /* Index Loop */
      for (int i = 1; i < 11; i++) {
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
            System.err.println("No, please try again");
         }
      } while (input <= 0);

      /* Use Case for Index Loop */
      String fullName = "Daniel Appenmaier";

      for (int i = 0; i < fullName.length(); i++) {
         System.out.println(i + ": " + fullName.charAt(i));
      }
   }

}
