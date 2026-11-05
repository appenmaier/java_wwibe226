package main;

import helper.StringArrayHelper;
import model.StringArray;

/**
 * Demo 18: Contrasts procedural and object-oriented approaches to managing a
 * dynamic string collection using {@link helper.StringArrayHelper} and {@link model.StringArray}.
 */
public class D18_Methods {

   public static void main(String[] args) {
      /* Procedural Programming */
      String[] names = new String[1];

      names = StringArrayHelper.add(names, "Hans");
      names = StringArrayHelper.add(names, "Peter");
      names = StringArrayHelper.add(names, "Heidi");
      names = StringArrayHelper.add(names, "Max");
      names = StringArrayHelper.add(names, "Berta");

      StringArrayHelper.print(names);

      System.out.println();

      /* Object Oriented Programming */
      StringArray names2 = new StringArray();

      names2.add("Hans");
      names2.add("Peter");
      names2.add("Heidi");
      names2.add("Max");
      names2.add("Berta");

      names2.print();
   }

}
