package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 05: Two-player dice game where each player rolls five dice per round
 * for five rounds; the player with more accumulated points wins.
 */
public class E05_DiceGame17 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      String name1, name2;
      int points1 = 0, points2 = 0;
      int[] dice1 = new int[5]; // [0][0][0][0][0]
      int[] dice2 = new int[5]; // [0][0][0][0][0]

      Scanner scanner = new Scanner(System.in);

      System.out.print("Player 1, enter name: ");
      name1 = scanner.next();
      System.out.print("Player 2, enter name: ");
      name2 = scanner.next();

      System.out.println();

      System.out.println("Round - Throw value " + name1 + " - Throw value " + name2 + " - Difference");
      for (int i = 1; i <= 5; i++) {
         /* Roll the Dice */
         for (int x = 0; x < dice1.length; x++) {
            dice1[x] = E05_DiceGame17.rollTheDice(); // rollTheDice(); [5][2][5][1][6]
            dice2[x] = E05_DiceGame17.rollTheDice(); // rollTheDice(); [4][3][2][2][5]
         }

         /* Sum the Dice Values */
         int total1 = 0, total2 = 0;
         for (int x = 0; x < dice1.length; x++) {
            total1 += dice1[x];
            total2 += dice2[x];
         }

         /* Calculate Difference */
         int difference = Math.abs(total1 - total2);

         if (total1 > total2) {
            points1 += difference;
         } else if (total2 > total1) {
            points2 += difference;
         }

         /* Output */
         System.out.println(i + " - " + total1 + " - " + total2 + " - " + difference);
      }

      System.out.println();
      System.out.println(name1 + ": " + points1 + " points");
      System.out.println(name2 + ": " + points2 + " points");
   }

   /**
    * Returns a random dice roll result between 1 and 6 (inclusive).
    *
    * @return a random integer from 1 to 6
    */
   public static int rollTheDice() {
      Random random = new Random();

      int randomNumber = random.nextInt(1, 7);

      return randomNumber;
   }

}
