package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.LegoFigure;
import model.LegoFigureHead;
import model.LegoFigureLegs;
import model.LegoFigureTorso;

/**
 * Demo 29: reads LEGO figures from a file and recreates them as objects.
 */
public class D29_Repetition3 {

   public static void main(String[] args) throws FileNotFoundException {
      File file = new File("src/main/resources/legofigures.txt");
      ArrayList<LegoFigure> legoFigures = D29_Repetition3.readLegoFigures(file);

      for (int i = 0; i < legoFigures.size(); i++) {
         LegoFigure legoFigure = legoFigures.get(i);
         legoFigure.executeAction((i + 1) + " " + legoFigure);
      }

      /* Output */
      for (LegoFigure legoFigure : legoFigures) {
         System.out.println(legoFigure);
      }
   }

   /**
    * Reads LEGO figures from the given file and returns them as a list.
    * Each line describes one figure configuration and a count, formatted as
    * {@code HEAD;TORSO;LEGS;COUNT}.
    *
    * @param file the file to read the figure definitions from
    * @return the list of LEGO figures created from the file
    * @throws FileNotFoundException if the file does not exist
    */
   public static ArrayList<LegoFigure> readLegoFigures(File file) throws FileNotFoundException {
      ArrayList<LegoFigure> legoFigures = new ArrayList<>();

      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine(); // "DEFAULT;YELLOW_SPACE_MARINE;YELLOW_LEGS;2"
         String[] tokens = line.split(";"); // ["DEFAULT"]["YELLOW_SPACE_MARINE"]["YELLOW_LEGS"]["2"]

         LegoFigureHead head = LegoFigureHead.valueOf(tokens[0]);
         LegoFigureTorso torso = LegoFigureTorso.valueOf(tokens[1]);
         LegoFigureLegs legs = LegoFigureLegs.valueOf(tokens[2]);

         int numberOfFigures = Integer.parseInt(tokens[3]); // Integer numberOfFigures =
                                                            // Integer.valueOf(tokens[3]);

         for (int i = 0; i < numberOfFigures; i++) {
            LegoFigure legoFigure = new LegoFigure(head, torso, legs);
            legoFigures.add(legoFigure);
         }
      }

      scanner.close();

      return legoFigures;
   }

}
