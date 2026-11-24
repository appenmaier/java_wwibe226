package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.Person;

/**
 * Demo 26: reads a CSV-formatted text file of persons and parses each line into a
 * {@link model.Person} object using {@link java.util.Scanner}.
 */
public class D26_FileScanner {

   public static void main(String[] args) throws FileNotFoundException {
      /* Absolute Pathname */
      // File file =
      // new File("C:\\Users\\D054906\\git\\java_wwibe226\\src\\main\\resources\\persons.txt");

      /* Relative Pathname */
      File file = new File("src/main/resources/persons.txt");

      Scanner scanner = new Scanner(file);

      ArrayList<Person> persons = new ArrayList<>();

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine(); // "Hans Maier;1970;11;24;m;1.56"
         String[] tokens = line.split(";"); // ["Hans Maier", "1970", "11", "24", "m", "1.56"]

         String fullName = tokens[0]; // "Hans Maier"
         int year = Integer.parseInt(tokens[1]); // "1970" -> 1970
         int month = Integer.parseInt(tokens[2]); // "11" -> 11
         int dayOfMonth = Integer.parseInt(tokens[3]); // "24" -> 24
         LocalDate birthdate = LocalDate.of(year, month, dayOfMonth); // 1970-11-24
         char gender = tokens[4].charAt(0); // "m" -> 'm'
         double sizeInM = Double.parseDouble(tokens[5]); // "1.56" -> 1.56

         Person person = new Person(fullName, birthdate, gender, sizeInM);
         persons.add(person);
      }

      scanner.close();

      for (Person person : persons) {
         System.out.println(person);
      }
   }

}
