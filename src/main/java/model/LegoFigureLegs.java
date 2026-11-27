package model;

/**
 * Represents the legs of a LEGO figure, consisting of a left and a right leg.
 */
public enum LegoFigureLegs {

   YELLOW_LEGS("Yellow Default", "Yellow Default"), RED_LEGS("Red Default",
         "Red Default"), PIRATE_LEGS("Wooden Leg", "Default");

   /* Attributes */
   private final String leftLeg;
   private final String rightLeg;

   /* Methods */

   /**
    * Creates a leg assembly with the given left and right leg identifiers.
    *
    * @param leftLeg the left leg piece identifier
    * @param rightLeg the right leg piece identifier
    */
   LegoFigureLegs(String leftLeg, String rightLeg) {
      this.leftLeg = leftLeg;
      this.rightLeg = rightLeg;
   }

   public String getLeftLeg() {
      return leftLeg;
   }

   public String getRightLeg() {
      return rightLeg;
   }

   @Override
   public String toString() {
      return "LegoFigureLegs [leftLeg=" + leftLeg + ", rightLeg=" + rightLeg + "]";
   }

}
