package main;

import java.util.Random;

/**
 * Demonstrates {@link Math} utility methods and pseudo-random number generation
 * using {@link Random}, including bounded integer ranges and a coin-flip boolean.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D05_CalculationsAndPseudoRandomNumbers {

   public static void main(String[] args) {
      /* Arithmetic Operations */
      double result = Math.sqrt(64);
      System.out.println("sqrt(64) = " + result);

      /* Pseudo-Random Numbers */
      Random random = new Random();

      boolean isHead = random.nextBoolean();
      // nextInt(6) produces 0–5; adding 1 shifts the range to 1–6 (die roll)
      int randomNumber = random.nextInt(6) + 1;
      // nextInt(1, 7) uses the bounded form: lower inclusive, upper exclusive → 1–6
      int randomNumber2 = random.nextInt(1, 7);

      System.out.println("isHead: " + isHead);
      System.out.println("randomNumber: " + randomNumber);
      System.out.println("randomNumber2: " + randomNumber2);
   }

}
