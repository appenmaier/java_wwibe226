package main;

import java.util.ArrayList;

/**
 * Demo 25: demonstrates common {@link java.util.ArrayList} operations — adding, inserting,
 * removing, and iterating over elements.
 */
public class D25_ArrayLists {

   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();

      /* Add Elements */
      names.add("Hans");
      names.add("Peter");
      names.add("Fritz");
      names.add("Barbara");
      names.add("Heidi");

      /* Insert Elements */
      names.add(1, "Anna");
      names.add(1, "Mia");

      /* Remove Elements */
      names.remove("Barbara");
      names.remove(0);

      /* Read Elements with index loop */
      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println(name);
      }
      System.out.println();

      /* Read Elements with for each loop */
      for (String name : names) {
         System.out.println(name);
      }
      System.out.println();

      /* Output */
      System.out.println(names);
   }

}
