package main;

/**
 * Demonstrates arithmetic operators in Java, including the five base operations,
 * increment/decrement shortcuts, pre- vs. post-increment, and the special
 * floating-point results produced by division by zero.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D04_ArithmeticOperations {

   public static void main(String[] args) {
      /* Base Operations */
      int a = 5, b = 3;

      int c1 = a + b; // Addition
      int c2 = a - b; // Subtraction
      int c3 = a * b; // Multiplication
      // Both operands are int, so the fractional part is discarded
      int c4 = a / b; // Integer Division
      int c5 = a % b; // Remainder of Division
      // Cast one operand to double to force floating-point division
      double c6 = (double) a / b; // Division

      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4: " + c4);
      System.out.println("c5: " + c5);
      System.out.println("c6: " + c6);

      /* Increment */
      int c = 0;
      c = c + 1;
      c += 1;
      c++;
      System.out.println("c: " + c);

      /* Decrement */
      c = c - 1;
      c -= 1;
      c--;
      System.out.println("c: " + c);

      /* Pre-increment vs. Post-increment */
      c = 0;
      a = 5;
      // Pre-increment: a is incremented before its value is assigned to c
      c = ++a; // a = a + 1; c = a;
      System.out.println("a: " + a);
      System.out.println("c: " + c);

      c = 0;
      a = 5;
      // Post-increment: a's original value is assigned to c, then a is incremented
      c = a++; // c = a; a = a + 1;
      System.out.println("a: " + a);
      System.out.println("c: " + c);

      /* Division by Zero */
      // Floating-point division by zero yields special IEEE 754 values instead of an exception
      double d1 = 1.0 / 0.0;
      double d2 = 1.0 / -0.0;
      double d3 = 0.0 / 0.0;
      double d4 = 0.0 / -0.0;
      // int i1 = 1 / 0; // Runtime Error
      // int i2 = 1 / -0; // Runtime Error

      System.out.println("d1: " + d1); // Infinity
      System.out.println("d2: " + d2); // - Infinity
      System.out.println("d3: " + d3); // NaN
      System.out.println("d4: " + d4); // NaN
   }

}
