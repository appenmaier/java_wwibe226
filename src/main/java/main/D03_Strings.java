package main;

/**
 * Demonstrates common {@link String} operations, including length queries,
 * character access, and string concatenation to build a SQL query.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D03_Strings {

   public static void main(String[] args) {
      /* Important String Methods */
      String text = "Hello World";

      int length = text.length();
      char firstCharacter = text.charAt(0);
      // Index of the last character is length - 1
      char lastCharacter = text.charAt(text.length() - 1);

      System.out.println("length: " + length);
      System.out.println("firstCharacter: " + firstCharacter);
      System.out.println("lastCharacter: " + lastCharacter);
      System.out.println();

      /* Concatenation of Strings */
      String fields = "id, name";
      String table = "Person";
      // Escaped quotes allow embedding a string literal inside the SQL condition
      String condition = "name = \"Appenmaier\"";
      // \n produces newline characters so each SQL clause appears on its own line
      String sqlQuery = "SELECT " + fields + "\nFROM " + table + "\nWHERE " + condition + ";";

      System.out.println(sqlQuery);
   }

}
