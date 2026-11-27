package main;

import model.LegoFigure;
import model.LegoFigureHead;
import model.LegoFigureLegs;
import model.LegoFigureTorso;

/**
 * Demo 19: demonstrates object creation and method calls using LEGO figure models.
 */
public class D19_Repetition1 {

   public static void main(String[] args) {
      /* Yellow Legs */
      // LegoFigureLegs yellowLegs = new LegoFigureLegs();
      // yellowLegs.leftLeg = "Yellow Default";
      // yellowLegs.rightLeg = "Yellow Default";
      // LegoFigureLegs yellowLegs = new LegoFigureLegs("Yellow Default", "Yellow Default");

      /* Red Legs */
      // LegoFigureLegs redLegs = new LegoFigureLegs();
      // redLegs.leftLeg = "Red Default";
      // redLegs.rightLeg = "Red Default";
      // LegoFigureLegs redLegs = new LegoFigureLegs("Red Default", "Red Default");

      /* LEGO Figure Space Marine */
      // LegoFigure spaceMarine = new LegoFigure();
      // spaceMarine.torso = "Yellow Space Marine";
      // spaceMarine.head = "Default";
      // spaceMarine.legs = yellowLegs;
      // spaceMarine.headGear = "White Helmet";
      // LegoFigure spaceMarine = new LegoFigure("Default", "Yellow Space Marine", yellowLegs);
      LegoFigure spaceMarine = new LegoFigure(LegoFigureHead.DEFAULT,
            LegoFigureTorso.YELLOW_SPACE_MARINE,
            LegoFigureLegs.YELLOW_LEGS);
      spaceMarine.setHeadGear("White Helmet");

      // spaceMarine.present();
      System.out.println(spaceMarine);
      spaceMarine.executeAction("Raise hand");

      System.out.println();

      /* LEGO Figure Red Knight */
      // LegoFigure redKnight = new LegoFigure();
      // redKnight.torso = "Red Knight";
      // redKnight.head = "Default";
      // redKnight.legs = redLegs;
      // redKnight.headGear = "Knight Helmet";
      // redKnight.toolLeft = "Shield";
      // redKnight.toolRight = "Sword";
      // LegoFigure redKnight = new LegoFigure("Default", "Red Knight", redLegs);
      LegoFigure redKnight = new LegoFigure(LegoFigureHead.DEFAULT,
            LegoFigureTorso.RED_KNIGHT,
            LegoFigureLegs.RED_LEGS);
      redKnight.setHeadGear("Knight Helmet");
      redKnight.setLeftTool("Shield");
      // the second call overwrites the first: the last setter call wins
      redKnight.setRightTool("Axe");
      redKnight.setRightTool("Sword");

      // redKnight.present();
      System.out.println(redKnight);
      redKnight.walk();
      redKnight.executeAction("Attack with sword");
   }

}
