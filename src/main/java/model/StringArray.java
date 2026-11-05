package model;

/** A dynamically growing array of strings backed by a plain Java array. */
public class StringArray {

   /* Attributes */
   public String[] array = new String[1];

   /* Methods */
   /** Adds a value to the first empty slot, doubling the array capacity if full. */
   public void add(String value) {
      // last slot occupied — double capacity and copy existing elements
      if (array[array.length - 1] != null) {
         String[] tmp = new String[array.length * 2];
         for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
         }
         array = tmp;
      }

      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            array[i] = value;
            break;
         }
      }
   }

   /** Prints all non-null elements of the array, one per line. */
   public void print() {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            continue;
         }
         System.out.println(array[i]);
      }
   }

}
