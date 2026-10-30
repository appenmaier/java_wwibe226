package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 04 (Loops05): Number guessing game where the user tries to guess a random number
 * between 1 and 100, with hints after each wrong guess and the option to stop guessing.
 */
public class E04_Loops05 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      int randomNumber = random.nextInt(1, 101);

      boolean continueGuessing;
      int attempts = 0;

      do {
         System.out.print("Please enter your guess: ");
         int guess = scanner.nextInt();
         attempts++;

         if (guess == randomNumber) {
            System.out.println("Correct. You needed " + attempts + " attempt(s)");
            break;
         }

         if (guess > randomNumber) {
            System.out.println("Wrong, the number is smaller");
         } else if (guess < randomNumber) {
            System.out.println("Wrong, the number is larger");
         }

         System.out.print("Do you want to guess again (true, false)?: ");
         continueGuessing = scanner.nextBoolean();
      } while (continueGuessing);
   }

}
