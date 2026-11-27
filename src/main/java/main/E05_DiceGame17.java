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
      Random random = new Random();

      System.out.print("Player 1, enter name: ");
      name1 = scanner.next();
      System.out.print("Player 2, enter name: ");
      name2 = scanner.next();

      System.out.println();

      // %-8s left-aligns the headers to the same column width as the data rows below;
      // 10 is only a minimum width, so player names longer than 10 characters break the alignment
      System.out.printf("%-8s %-10s %-10s %s%n", "Round", name1, name2, "Difference");
      for (int i = 1; i <= 5; i++) {
         /* Roll the Dice */
         for (int j = 0; j < dice1.length; j++) {
            dice1[j] = rollTheDice(random);
            dice2[j] = rollTheDice(random);
         }

         /* Sum the Dice Values */
         int total1 = 0, total2 = 0;
         for (int j = 0; j < dice1.length; j++) {
            total1 += dice1[j];
            total2 += dice2[j];
         }

         /* Calculate Difference */
         int difference = Math.abs(total1 - total2);

         if (total1 > total2) {
            points1 += difference;
         } else if (total2 > total1) {
            points2 += difference;
         }

         /* Output */
         System.out.printf("%-8d %-10d %-10d %d%n", i, total1, total2, difference);
      }

      System.out.println();
      System.out.println(name1 + ": " + points1 + " points");
      System.out.println(name2 + ": " + points2 + " points");

      /* Determine Winner */
      if (points1 > points2) {
         System.out.println(name1 + " wins!");
      } else if (points2 > points1) {
         System.out.println(name2 + " wins!");
      } else {
         System.out.println("It's a draw!");
      }
   }

   /**
    * Returns a random dice roll result between 1 and 6 (inclusive).
    *
    * @param random the random number generator to use
    * @return a random integer from 1 to 6
    */
   public static int rollTheDice(Random random) {
      return random.nextInt(1, 7);
   }

}
