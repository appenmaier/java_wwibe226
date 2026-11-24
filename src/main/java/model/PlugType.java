package model;

/** Represents a standardized electrical plug type with its norm and common region of use. */
public enum PlugType {

   /* Enumeration Constants */
   TYPE_F("Type-F", "CEE 7/4", "Europe"), TYPE_I("Type-I", "AS/NZS 3112",
         "Australia"), TYPE_B("Type-B", "NEMA-5", "North America");

   /* Attributes */
   private final String description;
   private final String norm;
   private final String region;

   /* Methods */

   /**
    * Creates a plug type with the given description, norm, and region.
    *
    * @param description the human-readable plug type description
    * @param norm        the technical standard the plug conforms to
    * @param region      the region where this plug type is commonly used
    */
   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

   public String description() {
      return description;
   }

   public String norm() {
      return norm;
   }

   public String region() {
      return region;
   }

}
