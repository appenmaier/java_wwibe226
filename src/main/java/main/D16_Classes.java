package main;

import model.LightBulb;
import model.TableLight;

/**
 * Demo 16: Demonstrates class instantiation, field access, and method calls using the
 * {@link model.TableLight} and {@link model.LightBulb} model classes.
 */
public class D16_Classes {

   public static void main(String[] args) {
      TableLight light1 = new TableLight();
      LightBulb blueLightBulb = new LightBulb();
      LightBulb redLightBulb = new LightBulb();

      blueLightBulb.color = "blue";
      redLightBulb.color = "red";

      boolean isShining = light1.isShining();
      if (isShining) {
         System.out.println("light shines " + light1.lightBulb.color);
      } else {
         System.out.println("light doesn't shine");
      }

      light1.plugIn();
      light1.switchOn();
      light1.changeLightBulb(redLightBulb);

      isShining = light1.isShining();
      if (isShining) {
         System.out.println("light shines " + light1.lightBulb.color);
      } else {
         System.out.println("light doesn't shine");
      }

      LightBulb oldLightBulb = light1.changeLightBulb(blueLightBulb);
      System.out.println("old light bulb color was " + oldLightBulb.color);

      isShining = light1.isShining();
      if (isShining) {
         System.out.println("light shines " + light1.lightBulb.color);
      } else {
         System.out.println("light doesn't shine");
      }
   }

}
