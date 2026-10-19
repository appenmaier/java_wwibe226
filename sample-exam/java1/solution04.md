# Aufgabe 4 (28 Punkte)

## Klasse GoalKeeper

```java
public class GoalKeeper extends AbstractPlayer { // 1

   private final double savePercentage; // 0,5

   public GoalKeeper(String name, int jerseyNumber, double savePercentage) { // 0,5
      super(name, jerseyNumber); // 1
      this.savePercentage = savePercentage; // 0,5
   } // 2

   public double getSavePercentage() { // 0,5
      return savePercentage; // 0,5
   } // 1

} // 4,5
```

## Klasse SoccerTeam

```java
public class SoccerTeam { // 0,5

    private final String name; // 0,5
    private List<AbstractPlayer> players; // 0,5

    public SoccerTeam(String name, List<AbstractPlayer> players) { // 0,5
        this.name = name; // 0,5
        this.players = players; // 0,5
    } // 1,5

    public boolean hasGoalkeeperWithNoSaves() { // 0,5
        for (AbstractPlayer p : players) { // 1
            if (p instanceof GoalKeeper gk && gk.getSavePercentage() == 0) { // 1,5
                return true; // 0,5
            }
        }
        return false; // 0,5
    } // 4

    public int getTotalGoalsScored() { // 0,5
        int total = 0; // 0,5
        for (AbstractPlayer p : players) { // 1
            if (p instanceof FieldPlayer fp) { // 1
                total += fp.getGoalsScored(); // 1
            }
        }
        return total; // 0,5
    } // 4,5

} // 11,5
```

## Klasse PlayerReader

```java
public class PlayerReader { // 0,5

    public static List<AbstractPlayer> readPlayers(File file)
            throws FileNotFoundException { // 0,5
        List<AbstractPlayer> players = new ArrayList<>(); // 0,5
        Scanner scanner = new Scanner(file); // 0,5
        while (scanner.hasNextLine()) { // 1
            String line = scanner.nextLine(); // 0,5
            String[] tokens = line.split(";"); // 1
            String name = tokens[0]; // 0,5
            int jerseyNumber = Integer.parseInt(tokens[1]); // 1
            String type = tokens[2]; // 0,5
            if (type.equals("G")) { // 1
                double savePercentage = Double.parseDouble(tokens[3]); // 1
                players.add(new GoalKeeper(name, jerseyNumber, savePercentage)); // 1
            } else { // 0,5
                players.add(new FieldPlayer(name, jerseyNumber)); // 1
            }
        }
        scanner.close(); // 0,5
        return players; // 0,5
    } // 11,5

} // 12
```
