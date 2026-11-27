package main;

import model.FlashLight;

/**
 * Demo 31: contrasts reference equality ({@code ==}) with value equality
 * ({@code equals}) on objects.
 */
public class D31_ObjectMethods {

   public static void main(String[] args) {
      FlashLight flashLight1 = new FlashLight();
      FlashLight flashLight2 = new FlashLight();

      System.out.println(flashLight1 == flashLight2);
      System.out.println(flashLight1.equals(flashLight2));
   }

}
