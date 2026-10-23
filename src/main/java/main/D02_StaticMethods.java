package main;

import helper.Calculator;
import helper.Printer;

/**
 * Demonstrates the use of static utility methods from the {@link helper.Printer} and
 * {@link helper.Calculator} helper classes.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D02_StaticMethods {

   public static void main(String[] args) {
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printTextInUpperCase("Winter");
      Printer.printTextInUpperCase("is");
      Printer.printTextInUpperCase("Coming");

      int result;

      result = Calculator.multiply(5, 3);
      System.out.println("5 * 3 = " + result);

      result = Calculator.multiply(7, 2);
      System.out.println("7 * 2 = " + result);

      result = Calculator.subtract(10, 8);
      System.out.println("10 - 8 = " + result);

      result = Calculator.add(-9, -3);
      System.out.println("(-9) + (-3) = " + result);

      System.out.println(D01_DataTypesAndDataObjects.PI);
   }

}
