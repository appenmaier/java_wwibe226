package main;

import java.util.ArrayList;

import model.PlugType;
import model.TableLight;

/**
 * Demo 28: demonstrates enumerations by filtering a list of {@link model.TableLight} objects by
 * their {@link model.PlugType}.
 */
public class D28_Enumerations {

   public static void main(String[] args) {
      TableLight tableLight1 = new TableLight();
      TableLight tableLight2 = new TableLight();
      TableLight tableLight3 = new TableLight(PlugType.TYPE_B);
      TableLight tableLight4 = new TableLight(PlugType.TYPE_F);

      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(tableLight1);
      tableLights.add(tableLight2);
      tableLights.add(tableLight3);
      tableLights.add(tableLight4);

      for (TableLight tableLight : tableLights) {
         if (tableLight.plugType() == PlugType.TYPE_F) {
            System.out.println(tableLight);
         }
      }

      PlugType typeI = PlugType.valueOf("TYPE_I");
      System.out.println(typeI);
   }

}
