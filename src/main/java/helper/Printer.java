package helper;

/**
 * Provides static utility methods for printing text to the console.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class Printer {

   /**
    * Prints the text "Hello World" to the console.
    */
   public static void printHelloWorld() {
      System.out.println("Hello World");
   }

   /**
    * Prints the given text converted to upper case.
    *
    * @param text the text to print
    */
   public static void printTextInUpperCase(String text) {
      System.out.println(text.toUpperCase());
   }

}
