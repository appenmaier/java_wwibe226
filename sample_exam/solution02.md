# Aufgabe 2 (25)

## Klasse TerrainDice

```java
public class TerrainDice { // 0,5

    public Terrain rollTheDice() { // 0,5
        Random random = new Random(); // 0,5
        int randomNumber = random.nextInt(4); // 0,5
        return switch (randomNumber) { // 1
            case 0  -> Terrain.MOUNTAIN; // 0,5
            case 1  -> Terrain.FOREST; // 0,5
            case 2  -> Terrain.PLAINS; // 0,5
            default -> Terrain.SWAMP; // 0,5
        };
    } // 4,5

} // 5
```

##Klasse MainClass

```java
public class MainClass { // 0,5

    private static Scanner scanner; // 0,5
    private static Player player1; // 0,5
    private static Player player2; // 0,5
    private static TerrainDice dice; // 0,5

    public static void main(String[] args) { // 0,5
        scanner = new Scanner(System.in); // 1

        System.out.print("Spieler 1, bitte Namen eingeben: "); // 0,5
        player1 = new Player(scanner.nextLine(), 10); // 1

        System.out.print("Spieler 2, bitte Namen eingeben: "); // 0,5
        player2 = new Player(scanner.nextLine(), 10); // 1

        dice = new TerrainDice(); // 0,5

        int round = 0; // 0,5
        System.out.println();
        while (player1.getStamina() > 0 && player2.getStamina() > 0) { // 1
            round++; // 0,5
            System.out.println("Runde " + round + ":"); // 0,5

            Terrain terrain1 = dice.rollTheDice(); // 0,5
            player1.reduceStamina(terrain1.getStaminaCost()); // 1
            System.out.println(player1.name() + " würfelt "
                    + terrain1.getDescription()
                    + " (Kosten: " + terrain1.getStaminaCost()
                    + ") - Ausdauer: "
                    + player1.getStamina()); // 1,5

            Terrain terrain2 = dice.rollTheDice(); // 0,5
            player2.reduceStamina(terrain2.getStaminaCost()); // 1
            System.out.println(player2.name() + " würfelt "
                    + terrain2.getDescription()
                    + " (Kosten: " + terrain2.getStaminaCost()
                    + ") - Ausdauer: "
                    + player2.getStamina()); // 1,5
            System.out.println();
        }

        if (player1.getStamina() <= 0 && player2.getStamina() <= 0) { // 1
            System.out.println("Unentschieden!"); // 0,5
        } else if (player1.getStamina() <= 0) { // 1
            System.out.println(player1.name() + " hat keine Ausdauer mehr - "
                    + player2.name() + " gewinnt!"); // 0,5
        } else { // 0,5
            System.out.println(player2.name() + " hat keine Ausdauer mehr - "
                    + player1.name() + " gewinnt!"); // 0,5
        }
    } // 17,5

} // 20
```
