package model;

import java.time.LocalDate;

/** Represents a person with a full name, birthdate, gender, and height. */
public class Person {

   /* Attributes */
   private String fullName;
   private final LocalDate birthdate;
   private char gender;
   private double sizeInM;

   /* Methods */

   /**
    * Creates a person with the given name, birthdate, gender, and height.
    *
    * @param fullName  the person's full name
    * @param birthdate the person's date of birth
    * @param gender    the person's gender ({@code 'm'} or {@code 'f'})
    * @param sizeInM   the person's height in metres
    */
   public Person(String fullName, LocalDate birthdate, char gender, double sizeInM) {
      this.fullName = fullName;
      this.birthdate = birthdate;
      this.gender = gender;
      this.sizeInM = sizeInM;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public double getSizeInM() {
      return sizeInM;
   }

   public void setSizeInM(double sizeInM) {
      this.sizeInM = sizeInM;
   }

   public LocalDate birthdate() {
      return birthdate;
   }

   @Override
   public String toString() {
      return "Person [fullName=" + fullName + ", birthdate=" + birthdate + ", gender=" + gender
            + ", sizeInM=" + sizeInM + "]";
   }

}
