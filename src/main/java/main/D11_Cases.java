package main;

import java.util.Scanner;

/**
 * Demo 11: Demonstrates switch expressions as a concise alternative to if-else chains.
 */
public class D11_Cases {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Input gender: ");
      char gender = scanner.next().charAt(0);

      /* Approach with Branches */
      String genderText;
      if (gender == 'm' || gender == 'M') {
         genderText = "male";
      } else if (gender == 'f' || gender == 'F') {
         genderText = "female";
      } else if (gender == 'd' || gender == 'D') {
         genderText = "diverse";
      } else {
         genderText = "";
      }
      System.out.println(genderText);

      /* Approach with Cases */
      genderText = switch (gender) {
         case 'm', 'M' -> "male";
         case 'f', 'F' -> "female";
         case 'd', 'D' -> "diverse";
         default       -> "";
      };
      System.out.println(genderText);
   }

}
