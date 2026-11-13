package main;

import model.LightBulb;
import model.TableLight;

/**
 * Demo 22: demonstrates constructor overloading by creating {@link model.LightBulb} instances
 * via different constructors.
 */
public class D22_Constructors {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb("red");
      // redLightBulb.setColor("red");
      // redLightBulb.setColor("blue");

      LightBulb whiteLightBulb = new LightBulb();

      char[] color = {'b', 'l', 'u', 'e'};
      LightBulb blueLightBulb = new LightBulb(color);

      TableLight light1 = new TableLight();
      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(blueLightBulb);

      if (light1.isShining()) {
         System.out.println(light1.getLightBulb().getColor());
      }
   }

}
