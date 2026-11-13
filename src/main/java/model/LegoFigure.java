package model;

/**
 * Represents a LEGO figure with a head, torso, legs, optional head gear, and up to two tools.
 */
public class LegoFigure {

   /* Attributes */
   public String head;
   public String torso;
   public LegoFigureLegs legs;
   public String headGear;
   public String toolLeft;
   public String toolRight;

   /* Methods */
   /**
    * Prints a walking message to the console.
    */
   public void walk() {
      System.out.println("I'm walking");
   }

   /**
    * Prints the given action to the console.
    *
    * @param action the action to execute
    */
   public void executeAction(String action) {
      System.out.println(action);
   }

   /**
    * Prints all parts of this figure (head gear, head, torso, legs, tools) to the console.
    */
   public void present() {
      System.out.println(headGear);
      System.out.println(head);
      System.out.println(torso);
      System.out.println("Legs: " + legs.leftLeg + ", " + legs.rightLeg);
      System.out.println("Tools: " + toolLeft + ", " + toolRight);
   }

}
