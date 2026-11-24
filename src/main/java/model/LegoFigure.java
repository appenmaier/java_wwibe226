package model;

/**
 * Represents a LEGO figure with a head, torso, legs, optional head gear, and up to two tools.
 */
public class LegoFigure {

   /* Attributes */
   private final String head;
   private final String torso;
   private final LegoFigureLegs legs;
   private String headGear;
   private String toolLeft;
   private String toolRight;

   /* Methods */

   /**
    * Creates a LEGO figure with the given head, torso, and legs.
    *
    * @param head  the head piece identifier
    * @param torso the torso piece identifier
    * @param legs  the leg assembly attached to this figure
    */
   public LegoFigure(String head, String torso, LegoFigureLegs legs) {
      this.head = head;
      this.torso = torso;
      this.legs = legs;
   }

   /**
    * Equips the figure with the given head gear.
    *
    * @param headGear the head gear piece identifier
    */
   public void setHeadGear(String headGear) {
      this.headGear = headGear;
   }

   /**
    * Places a tool in the figure's left hand.
    *
    * @param toolLeft the tool identifier for the left hand
    */
   public void setToolLeft(String toolLeft) {
      this.toolLeft = toolLeft;
   }

   /**
    * Places a tool in the figure's right hand.
    *
    * @param toolRight the tool identifier for the right hand
    */
   public void setToolRight(String toolRight) {
      this.toolRight = toolRight;
   }

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

   public String getHead() {
      return head;
   }

   public String getTorso() {
      return torso;
   }

   public LegoFigureLegs getLegs() {
      return legs;
   }

   public String getHeadGear() {
      return headGear;
   }

   public String getToolLeft() {
      return toolLeft;
   }

   public String getToolRight() {
      return toolRight;
   }

   @Override
   public String toString() {
      return "LegoFigure [head=" + head + ", torso=" + torso + ", legs=" + legs + ", headGear="
            + headGear + ", toolLeft=" + toolLeft + ", toolRight=" + toolRight + "]";
   }

}
