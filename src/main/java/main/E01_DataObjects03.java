package main;

/**
 * Exercise: declares and initializes variables of types {@code String}, {@code int},
 * and {@code char}, then prints each value to the console.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class E01_DataObjects03 {

   public static void main(String[] args) {
      /* Declaration */
      String name;
      int age;
      char gender;

      /* Initialization */
      name = "Hans";
      age = 42;
      gender = 'M';

      /* Output */
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
   }

}
