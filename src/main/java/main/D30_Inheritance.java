package main;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.PlugType;
import model.TableLight;

/**
 * Demo 30: demonstrates inheritance, upcasting, downcasting, and polymorphism
 * using a common {@link Light} superclass.
 */
public class D30_Inheritance {

   public static void main(String[] args) {
      /* Instantiations */
      TableLight tableLight1 = new TableLight();
      TableLight tableLight2 = new TableLight(PlugType.TYPE_I);
      TableLight tableLight3 = new TableLight();

      FlashLight flashLight1 = new FlashLight();
      FlashLight flashLight2 = new FlashLight();
      FlashLight flashLight3 = new FlashLight();
      FlashLight flashLight4 = new FlashLight();

      LightBulb whiteLightBulb = new LightBulb();
      tableLight1.changeLightBulb(whiteLightBulb);
      LightBulb blueLightBulb = new LightBulb("blue");
      tableLight3.changeLightBulb(blueLightBulb);

      /* Approach without Inheritance */
      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(tableLight1);
      tableLights.add(tableLight2);
      tableLights.add(tableLight3);

      for (TableLight tableLight : tableLights) {
         tableLight.switchOn();
         tableLight.plugIn();
         System.out.println(tableLight.isShining());
         System.out.println(tableLight.toString());
         tableLight.switchOff();
         tableLight.pullThePlug();
      }

      ArrayList<FlashLight> flashLights = new ArrayList<>();
      flashLights.add(flashLight1);
      flashLights.add(flashLight2);
      flashLights.add(flashLight3);
      flashLights.add(flashLight4);

      for (FlashLight flashLight : flashLights) {
         flashLight.switchOn();
         flashLight.recharge();
         System.out.println(flashLight.isShining());
         System.out.println(flashLight.toString());
         flashLight.switchOff();
      }
      System.out.println();

      /* Approach with Inheritance */
      ArrayList<Light> lights = new ArrayList<>();
      Light light1 = tableLight1; // explicit upcast
      lights.add(light1);
      lights.add(tableLight2); // implicit upcast
      lights.add(tableLight3); // implicit upcast
      lights.add(flashLight1); // implicit upcast
      lights.add(flashLight2); // implicit upcast
      lights.add(flashLight3); // implicit upcast
      lights.add(flashLight4); // implicit upcast

      for (Light light : lights) {
         light.switchOn(); // dynamic polymorphism

         if (light instanceof FlashLight) {
            FlashLight flashLight = (FlashLight) light; // downcast
            flashLight.recharge();
         } else if (light instanceof TableLight) {
            TableLight tableLight = (TableLight) light; // downcast
            tableLight.plugIn();
         }

         System.out.println(light.isShining()); // static and dynamic polymorphism
         System.out.println(light.toString()); // static and dynamic polymorphism

         light.switchOff();

         if (light instanceof TableLight) {
            TableLight tableLight = (TableLight) light; // downcast
            tableLight.pullThePlug();
         }
      }
   }

}
