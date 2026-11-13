package main;

import java.time.LocalDate;

import model.LightBulb;
import model.TableLight;

/**
 * Demo 23: shows how {@code toString()} is called implicitly when objects are passed to
 * {@code System.out.println}.
 */
public class D23_ToString {

   public static void main(String[] args) {
      String text = new String("Hello World");
      LightBulb lightBulb = new LightBulb("white");
      TableLight tableLight = new TableLight();
      LocalDate now = LocalDate.now();

      tableLight.changeLightBulb(lightBulb);

      System.out.println(text);
      System.out.println(lightBulb);
      System.out.println(tableLight);
      System.out.println(now);
   }

}
