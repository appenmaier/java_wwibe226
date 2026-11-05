package helper;

/** Utility methods for managing a dynamically growing string array. */
public class StringArrayHelper {

   /**
    * Adds a value to the first empty slot in the array, doubling its capacity if full.
    *
    * @param array the current string array
    * @param value the value to add
    * @return the (possibly resized) array containing the new value
    */
   public static String[] add(String[] array, String value) {
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

      return array;
   }

   /**
    * Prints all non-null elements of the array, one per line.
    *
    * @param array the string array to print
    */
   public static void print(String[] array) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == null) {
            continue;
         }
         System.out.println(array[i]);
      }
   }

}
