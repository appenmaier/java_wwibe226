package model;

/**
 * Base class for light sources that can be switched on or off.
 */
public class Light {

   /* Attributes */
   protected boolean isOn;

   /* Methods */
   /** Switches the light on. */
   public void switchOn() {
      isOn = true;
   }

   /** Switches the light off. */
   public void switchOff() {
      isOn = false;
   }

   /**
    * Returns whether the light is currently emitting light.
    *
    * @return {@code true} if the light is switched on
    */
   public boolean isShining() {
      return isOn;
   }

   public boolean isOn() {
      return isOn;
   }

   @Override
   public String toString() {
      return "Light [isOn=" + isOn + "]";
   }

}
