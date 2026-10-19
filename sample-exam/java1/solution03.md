# Aufgabe 3 (30 Punkte)

## Klasse CareInstructions

```java
public class CareInstructions { // 0,5

    private final int wateringIntervalInDays; // 0,5
    private final double sunlightHoursPerDay; // 0,5

    public CareInstructions(int wateringIntervalInDays,
            double sunlightHoursPerDay) { // 0,5
        this.wateringIntervalInDays = wateringIntervalInDays; // 0,5
        this.sunlightHoursPerDay = sunlightHoursPerDay; // 0,5
    } // 1,5

    public int getWateringIntervalInDays() { // 0,5
        return wateringIntervalInDays; // 0,5
    } // 1

    public double getSunlightHoursPerDay() { // 0,5
        return sunlightHoursPerDay; // 0,5
    } // 1

} // 5
```

## Klasse _Nursery_

```java
public class Nursery { // 0,5

    private final String name; // 0,5
    private final List<Plant> plants; // 0,5

    public Nursery(String name) { // 0,5
        this.name = name; // 0,5
        this.plants = new ArrayList<>(); // 0,5
    } // 1,5

    public String getName() { // 0,5
        return name; // 0,5
    } // 1

    public List<Plant> getPlants() { // 0,5
        return plants; // 0,5
    } // 1

    public void addPlant(Plant plant) { // 0,5
        plants.add(plant); // 0,5
    } // 1

    public List<Plant> getPlantsByType(PlantType type) { // 0,5
        List<Plant> result = new ArrayList<>(); // 0,5
        for (Plant p : plants) { // 1
            if (p.getType() == type) { // 1
                result.add(p); // 0,5
            }
        }
        return result; // 0,5
    } // 4

    public Plant getPlantBySunlight(double minSunlightHours) { // 0,5
        for (Plant p : plants) { // 1
            if (p.getCareInstructions().getSunlightHoursPerDay()
                    >= minSunlightHours) { // 1,5
                return p; // 0,5
            }
        }
        return null; // 0,5
    } // 4

    @Override
    public String toString() { // 0,5
        return name + ", Sortiment: " + plants; // 1
    } // 1,5

} // 15,5
```

## Klasse MainClass

```java
public class MainClass { // 0,5

    public static void main(String[] args) { // 0,5
        Nursery nursery = new Nursery("Grüner Daumen"); // 0,5

        Plant plant1 = new Plant("Apfelbaum", PlantType.TREE); // 0,5
        plant1.setCareInstructions(new CareInstructions(3, 6)); // 0,5
        plant1.setPriceInEuro(24.90); // 0,5

        Plant plant2 = new Plant("Lavendel", PlantType.SHRUB); // 0,5
        plant2.setCareInstructions(new CareInstructions(5, 8)); // 0,5
        plant2.setPriceInEuro(4.50); // 0,5

        Plant plant3 = new Plant("Tomate", PlantType.VEGETABLE); // 0,5
        plant3.setCareInstructions(new CareInstructions(1, 7)); // 0,5
        plant3.setPriceInEuro(2.99); // 0,5

        nursery.addPlant(plant1); // 0,5
        nursery.addPlant(plant2); // 0,5
        nursery.addPlant(plant3); // 0,5

        System.out.println(nursery.getPlantsByType(PlantType.TREE)); // 1
        System.out.println(nursery.getPlantBySunlight(7)); // 1
    } // 9

} // 9,5
```
