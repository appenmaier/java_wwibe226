package helper;

/**
 * Provides simple arithmetic operations on integers.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Calculator {

   /**
    * Adds two integers.
    *
    * @param a the first operand
    * @param b the second operand
    * @return the sum of {@code a} and {@code b}
    */
   public static int add(int a, int b) {
      int c = a + b;
      return c;
   }

   /**
    * Subtracts one integer from another.
    *
    * @param a the minuend
    * @param b the subtrahend
    * @return the difference {@code a - b}
    */
   public static int subtract(int a, int b) {
      int c = a - b;
      return c;
   }

   /**
    * Multiplies two integers.
    *
    * @param a the first factor
    * @param b the second factor
    * @return the product of {@code a} and {@code b}
    */
   public static int multiply(int a, int b) {
      int c = a * b;
      return c;
   }

   /**
    * Divides one integer by another using integer division.
    *
    * @param a the dividend
    * @param b the divisor (must not be zero)
    * @return the integer quotient of {@code a / b}
    */
   public static int divide(int a, int b) {
      int c = a / b;
      return c;
   }

}
