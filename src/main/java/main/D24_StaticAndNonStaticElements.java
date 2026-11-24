package main;

import model.TableLight;

/**
 * Demo 24: illustrates the difference between static (class-level) and non-static (instance-level)
 * members using the {@link model.TableLight} class.
 */
public class D24_StaticAndNonStaticElements {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      int numberOfTableLights = TableLight.getNumberOfTableLights();
      System.out.println(numberOfTableLights);

      TableLight tableLight1 = new TableLight();
      TableLight tableLight2 = new TableLight();
      TableLight tableLight3 = new TableLight();

      numberOfTableLights = TableLight.getNumberOfTableLights();
      System.out.println(numberOfTableLights);
   }

}
