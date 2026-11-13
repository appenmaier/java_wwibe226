package main;

import model.TableLight;

/**
 * Demo 20: illustrates the difference between primitive value copies and object reference sharing.
 */
public class D20_References {

   public static void main(String[] args) {
      int i = 0;
      TableLight light1 = null;

      i = 5;
      light1 = new TableLight();

      int x = i;
      TableLight light2 = light1;

      i = 7;
      light1.plugIn();

      System.out.println("i: " + i);
      System.out.println("x: " + x);
      System.out.println(light1 + ".isConnected: " + light1.isConnected);
      System.out.println(light2 + ".isConnected: " + light2.isConnected);
   }

}
