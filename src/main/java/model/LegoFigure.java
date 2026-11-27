package model;

/**
 * Represents a LEGO figure with a head, torso, legs, optional head gear, and up to two tools.
 */
public class LegoFigure {

   /* Attributes */
   private final LegoFigureHead head;
   private final LegoFigureTorso torso;
   private final LegoFigureLegs legs;
   private String headGear;
   private String leftTool;
   private String rightTool;

   /* Methods */

   /**
    * Creates a LEGO figure with the given head, torso, and legs.
    *
    * @param head the head piece identifier
    * @param torso the torso piece identifier
    * @param legs the leg assembly attached to this figure
    */
   public LegoFigure(LegoFigureHead head, LegoFigureTorso torso, LegoFigureLegs legs) {
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
    * @param leftTool the tool identifier for the left hand
    */
   public void setLeftTool(String leftTool) {
      this.leftTool = leftTool;
   }

   /**
    * Places a tool in the figure's right hand.
    *
    * @param rightTool the tool identifier for the right hand
    */
   public void setRightTool(String rightTool) {
      this.rightTool = rightTool;
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

   public LegoFigureHead getHead() {
      return head;
   }

   public LegoFigureTorso getTorso() {
      return torso;
   }

   public LegoFigureLegs getLegs() {
      return legs;
   }

   public String getHeadGear() {
      return headGear;
   }

   public String getLeftTool() {
      return leftTool;
   }

   public String getRightTool() {
      return rightTool;
   }

   @Override
   public String toString() {
      return "LegoFigure [head=" + head + ", torso=" + torso + ", legs=" + legs + ", headGear="
            + headGear + ", leftTool=" + leftTool + ", rightTool=" + rightTool + "]";
   }

}
