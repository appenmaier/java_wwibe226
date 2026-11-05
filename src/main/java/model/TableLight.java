package model;

/** Represents a table lamp that can be connected to power and switched on or off. */
public class TableLight {

   /* Attributes */
   public boolean isConnected;
   public boolean isOn;
   public LightBulb lightBulb;

   /* Methods */
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

}
