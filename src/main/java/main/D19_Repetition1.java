package main;

import model.LegoFigure;
import model.LegoFigureLegs;

/**
 * Demo 19: demonstrates object creation and method calls using LEGO figure models.
 */
public class D19_Repetition1 {

   public static void main(String[] args) {
      /* Yellow Legs */
      LegoFigureLegs yellowLegs = new LegoFigureLegs();
      yellowLegs.leftLeg = "Yellow Default";
      yellowLegs.rightLeg = "Yellow Default";

      /* Red Legs */
      LegoFigureLegs redLegs = new LegoFigureLegs();
      redLegs.leftLeg = "Red Default";
      redLegs.rightLeg = "Red Default";

      /* LEGO Figure Space Marine */
      LegoFigure spaceMarine = new LegoFigure();
      spaceMarine.torso = "Yellow Space Marine";
      spaceMarine.head = "Default";
      spaceMarine.legs = yellowLegs;
      spaceMarine.headGear = "White Helmet";

      spaceMarine.present();
      spaceMarine.executeAction("Raise hand");

      System.out.println();

      /* LEGO Figure Red Knight */
      LegoFigure redKnight = new LegoFigure();
      redKnight.torso = "Red Knight";
      redKnight.head = "Default";
      redKnight.legs = redLegs;
      redKnight.headGear = "Knight Helmet";
      redKnight.toolLeft = "Shield";
      redKnight.toolRight = "Sword";

      redKnight.present();
      redKnight.walk();
      redKnight.executeAction("Attack with sword");
   }

}
