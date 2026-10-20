package main;

/**
 * Data Types and Data Objects
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D01_DataTypesAndDataObjects {

   public static void main(String[] args) {
      /* Declarations */
      int age; // byte, short, long
      double sizeInM; // float
      boolean isMale;
      String firstName;
      String familyName;

      /* Initializations */
      age = 43;
      sizeInM = 1.79;
      isMale = true;
      firstName = "Daniel";
      familyName = "Appenmaier";

      /* Value Assignments */
      age = 44;

      /* Immutable Data Objects */
      final char gender = 'M';

      /* Output */
      System.out.println("age: " + age);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("isMale: " + isMale);
      System.out.println("gender: " + gender);
      System.out.println("firstName: " + firstName);
      System.out.println("familyName: " + familyName);
   }

}
