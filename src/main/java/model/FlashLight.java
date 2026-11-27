package model;

import java.util.Objects;

/**
 * Represents a flashlight powered by a rechargeable battery.
 */
public class FlashLight extends Light {

   /* Attributes */
   private double energyLevel;

   /* Methods */

   /** Creates a new flashlight with a partially charged battery. */
   public FlashLight() {
      energyLevel = 0.4;
   }

   /**
    * Switches the flashlight on, consuming part of its remaining energy.
    */
   @Override
   public void switchOn() {
      energyLevel -= 0.1;
      /* Option A: call the super method */
      // super.switchOn();

      /* Option B: use the protected attribute directly */
      isOn = true;
   }

   /** Recharges the battery to its full energy level. */
   public void recharge() {
      energyLevel = 1;
   }

   /**
    * Returns whether the flashlight is currently emitting light.
    *
    * @return {@code true} if switched on and the battery still has energy
    */
   @Override
   public boolean isShining() {
      return isOn() && energyLevel > 0;
   }

   public double getEnergyLevel() {
      return energyLevel;
   }

   @Override
   public String toString() {
      return "FlashLight [isOn=" + isOn() + ", energyLevel=" + energyLevel + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(energyLevel);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      FlashLight other = (FlashLight) obj;
      return Double.doubleToLongBits(energyLevel) == Double.doubleToLongBits(other.energyLevel);
   }

}
