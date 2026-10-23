package main;

import java.math.BigDecimal;

/**
 * Demonstrates Java's primitive data types ({@code int}, {@code double}, {@code boolean},
 * {@code char}) and reference types ({@code String}), including declaration, initialization,
 * reassignment, and the use of {@code final} for immutable data objects.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_DataTypesAndDataObjects {

   /* Constants */
   /** Approximation of the mathematical constant π, used for circle calculations. */
   public final static double PI = 3.14159265359;

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Declarations */
      int age; // alternatives: byte, short, long
      float sizeInM; // alternative: double
      boolean isMale;
      String firstName;
      String familyName;

      /* Initializations / Value Assignments */
      age = 43;
      age = 44;
      sizeInM = 1.79F;
      isMale = true;
      firstName = "Daniel";
      familyName = "Appenmaier";

      /* Special Forms */
      String hairColor = "Brown"; // Declaration with Initialization
      int a, b, c; // Multiple Declaration
      long bigNumber = 123_445_821_912_432L;
      float float1 = 0.1F;
      // BigDecimal reveals the full floating-point imprecision hidden by float's limited output
      BigDecimal bigDecimal1 = new BigDecimal(0.1F);

      /* Immutable Data Objects */
      final char gender = 'M';
      // gender = 'W'; // Compile Error

      /* Output */
      System.out.println("age: " + age);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("isMale: " + isMale);
      System.out.println("gender: " + gender);
      System.out.println("firstName: " + firstName);
      System.out.println("familyName: " + familyName);
      System.out.println("hairColor: " + hairColor);
      System.out.println("bigNumber: " + bigNumber);
      System.out.println("float1: " + float1);
      System.out.println("bigDecimal1: " + bigDecimal1);
   }

}
