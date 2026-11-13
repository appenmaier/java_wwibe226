package main;

import model.LightBulb;
import model.TableLight;

/**
 * Demo 21: demonstrates data encapsulation by using setters and getters instead of direct field
 * access.
 */
public class D21_DataEncapsulation {

   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb("red");
      // LightBulb redLightBulb = new LightBulb();
      // redLightBulb.color = "red";
      // redLightBulb.setColor("red");

      TableLight light1 = new TableLight();
      // light1.isConnected = true;
      light1.plugIn();
      // light1.isOn = true;
      light1.switchOn();
      // light1.lightBulb = redLightBulb;
      light1.changeLightBulb(redLightBulb);

      if (light1.isShining()) {
         // System.out.println(light1.lightBulb.color);
         System.out.println(light1.getLightBulb().getColor());
      }
   }

}
