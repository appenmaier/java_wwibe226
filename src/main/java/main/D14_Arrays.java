package main;

import java.util.Arrays;

/**
 * Demo 14: Demonstrates array declaration, initialization, element access, and sequential
 * iteration, including the difference between default {@code toString()} and
 * {@code Arrays.toString()}.
 */
public class D14_Arrays {

   public static void main(String[] args) {
      /* Declaration and Initialization */
      int[] numbers = new int[7];
      // [0][1][2][3][4][5][6] Index
      // [0][0][0][0][0][0][0] Value

      String[] names = {"Hans", null, "Peter"};

      /* Element Access */
      System.out.println("numbers.length: " + numbers.length);
      System.out.println("names.length: " + names.length);

      System.out.println();

      numbers[0] = 7;
      numbers[3] = 6;
      numbers[numbers.length - 1] = 3;
      // [0][1][2][3][4][5][6] Index
      // [7][0][0][6][0][0][3] Value

      names[0] = "Max";

      /* Sequential Access */
      for (int i = 0; i < numbers.length; i++) {
         System.out.print("[" + numbers[i] + "]");
      }
      System.out.println();
      System.out.println();

      /* Output */
      System.out.println(numbers);
      System.out.println(names);
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(names));
   }

}
