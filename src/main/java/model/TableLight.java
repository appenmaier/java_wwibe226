package model;

/** Represents a table lamp that can be connected to power and switched on or off. */
public class TableLight {

   /* Attributes */
   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;
   private final PlugType plugType;

   private static int numberOfTableLights;

   /* Methods */

   /**
    * Creates a new table lamp with the given plug type and increments the shared instance counter.
    *
    * @param plugType the plug type of the lamp
    */
   public TableLight(PlugType plugType) {
      this.plugType = plugType;
      numberOfTableLights++;
   }

   /** Creates a new table lamp with the default plug type {@link PlugType#TYPE_F}. */
   public TableLight() {
      plugType = PlugType.TYPE_F;
   }

   /** Connects the lamp to the power supply. */
   public void plugIn() {
      isConnected = true;
   }

   /** Disconnects the lamp from the power supply. */
   public void pullThePlug() {
      isConnected = false;
   }

   /** Turns the lamp on. */
   public void switchOn() {
      isOn = true;
   }

   /** Turns the lamp off. */
   public void switchOff() {
      isOn = false;
   }

   /**
    * Replaces the current light bulb with a new one and returns the old one.
    *
    * @param newLightBulb the replacement light bulb
    * @return the previously installed light bulb
    */
   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   /**
    * Returns whether the lamp is currently emitting light.
    *
    * @return {@code true} if connected, switched on, and a bulb is installed
    */
   public boolean isShining() {
      /* Variant A */
      // if (isConnected == true && isOn == true && lightBulb != null) {
      // return true;
      // } else {
      // return false;
      // }

      /* Variant B */
      // if (isConnected && isOn && lightBulb != null) {
      // return true;
      // } else {
      // return false;
      // }

      /* Variant C */
      return isConnected && isOn && lightBulb != null;
   }

   public LightBulb getLightBulb() {
      return lightBulb;
   }

   public boolean isConnected() {
      return isConnected;
   }

   public boolean isOn() {
      return isOn;
   }

   public PlugType plugType() {
      return plugType;
   }

   @Override
   public String toString() {
      return "TableLight [isConnected=" + isConnected + ", isOn=" + isOn + ", lightBulb="
            + lightBulb + ", plugType=" + plugType + "]";
   }

   /**
    * Returns the total number of {@link TableLight} instances created so far.
    *
    * @return the number of table lamp instances
    */
   public static int getNumberOfTableLights() {
      return numberOfTableLights;
   }

}
