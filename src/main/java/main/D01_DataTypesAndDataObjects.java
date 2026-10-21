package main;

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

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Declarations */
      int age; // byte, short, long
      double sizeInM; // float
      boolean isMale;
      String firstName;
      String familyName;

      /* Initializations / Value Assignments */
      age = 43;
      age = 44;
      sizeInM = 1.79;
      isMale = true;
      firstName = "Daniel";
      familyName = "Appenmaier";

      /* Special Forms */
      String hairColor = "Brown"; // Declaration with Initialization
      int a, b, c; // Multiple Declaration

      /* Immutable Data Objects */
      final char gender = 'M';

      /* Output */
      System.out.println("age: " + age);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("isMale: " + isMale);
      System.out.println("gender: " + gender);
      System.out.println("firstName: " + firstName);
      System.out.println("familyName: " + familyName);
      System.out.println("hairColor: " + hairColor);
   }

}
