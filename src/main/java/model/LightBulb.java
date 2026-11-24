package model;

/** Represents a light bulb with a given color. */
public class LightBulb {

   /* Attributes */
   private final String color;

   /* Methods */

   /**
    * Creates a light bulb with the given color.
    *
    * @param color the color of the bulb
    */
   public LightBulb(String color) {
      this.color = color;
   }

   /**
    * Creates a light bulb with the default color white.
    */
   public LightBulb() {
      color = "white";
   }

   /**
    * Creates a light bulb whose color is assembled from a character array.
    *
    * @param color the color spelled out as individual characters
    */
   public LightBulb(char[] color) {
      String result = "";
      // build a String from the char array one character at a time
      for (int i = 0; i < color.length; i++) {
         result += color[i];
      }
      this.color = result;
   }

   public String getColor() {
      return color;
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color + "]";
   }

}
