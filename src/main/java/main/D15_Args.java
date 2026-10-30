package main;

/**
 * Demo 15: Demonstrates how to access and print command-line arguments passed to the program.
 */
public class D15_Args {

   public static void main(String[] args) {
      for (int i = 0; i < args.length; i++) {
         String argument = args[i];
         System.out.println(argument);
      }
   }

}
