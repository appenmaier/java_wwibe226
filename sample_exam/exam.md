# Musterklausur Einführung in die Programmierung

## Hinweise

- Die in dieser Klausur verwendeten Personenbezeichnungen beziehen sich – sofern nicht anders kenntlich gemacht – auf alle Geschlechter
- Pakete und Klassenimporte müssen nicht angegeben werden
- Es kann davon ausgegangen werden, dass sämtliche Klassen entsprechende Implementierungen der Object-Methoden besitzen
- So nicht anders angegeben sollen Konstruktoren, Setter, Getter sowie die Object-Methoden wie in der Vorlesung gezeigt implementiert werden
- Die Konsolenausgaben-Methoden der Klasse **PrintStream** dürfen sinnvoll gekürzt geschrieben werden (zum Beispiel **syso("Hello World")** statt **System.out.println("Hello World")**)
- Methoden- und Attributsbezeichner dürfen sinnvoll gekürzt geschrieben werden (zum Beispiel **getLWMCP()** statt **getLectureWithMostCreditPoints()**)

## Wörterbuch

**Aufgabe 2**

| Englisch | Deutsch  |
| -------- | -------- |
| plains   | Ebene    |
| stamina  | Ausdauer |
| swamp    | Sumpf    |
| terrain  | Gelände  |

**Aufgabe 3**

| Englisch          | Deutsch                |
| ----------------- | ---------------------- |
| care instructions | Pflegehinweise         |
| nursery           | Baumschule / Gärtnerei |
| shrub             | Strauch                |
| sunlight          | Sonnenlicht            |
| vegetable         | Gemüse                 |
| watering          | Bewässerung / Gießen   |
| watering interval | Bewässerungsintervall  |

**Aufgabe 4**

| Englisch        | Deutsch     |
| --------------- | ----------- |
| field player    | Feldspieler |
| goalkeeper      | Torwart     |
| jersey          | Trikot      |
| player          | Spieler     |
| save percentage | Fangquote   |

## Aufgaben

- [Aufgabe 1 (18 Punkte)](task01.md) ([Musterlösung](solution01.md))
- [Aufgabe 2 (25 Punkte)](task02.md) ([Musterlösung](solution02.md))
- [Aufgabe 3 (30 Punkte)](task03.md) ([Musterlösung](solution03.md))
- [Aufgabe 4 (28 Punkte)](task04.md) ([Musterlösung](solution04.md))

## Cheatsheet

**java.lang**

| Klasse  | Methode                | Rückgabetyp | Level |
| ------- | ---------------------- | ----------- | ----- |
| Boolean | valueOf(s: String)     | Boolean     | S     |
| Boolean | valueOf(b: boolean)    | Boolean     | S     |
| Double  | valueOf(s: String)     | Double      | S     |
| Double  | valueOf(d: double)     | Double      | S     |
| Integer | valueOf(s: String)     | Integer     | S     |
| Integer | valueOf(i: int)        | Integer     | S     |
| Long    | valueOf(s: String)     | Long        | S     |
| Long    | valueOf(l: long)       | Long        | S     |
| Object  | equals(object: Object) | boolean     |       |
| Object  | hashCode()             | int         |       |
| Object  | toString()             | String      |       |
| String  | charAt(index: int)     | char        |       |
| String  | length()               | int         |       |
| String  | split(regex: String)   | String[]    |       |
| String  | toLowerCase()          | String      |       |
| String  | toUpperCase()          | String      |       |
| System  | currentTimeMillis()    | long        | S     |

**java.time**

| Klasse    | Methode                                    | Rückgabetyp | Level |
| --------- | ------------------------------------------ | ----------- | ----- |
| LocalDate | getDayOfMonth()                            | int         |       |
| LocalDate | getDayOfYear()                             | int         |       |
| LocalDate | getMonth()                                 | Month       |       |
| LocalDate | getMonthValue()                            | int         |       |
| LocalDate | getYear()                                  | int         |       |
| LocalDate | now()                                      | LocalDate   | S     |
| LocalDate | of(year: int, month: int, dayOfMonth: int) | LocalDate   | S     |
| LocalDate | parse(text: CharSequence)                  | LocalDate   | S     |
| LocalTime | getHour()                                  | int         |       |
| LocalTime | getMinute()                                | int         |       |
| LocalTime | getSecond()                                | int         |       |
| LocalTime | now()                                      | LocalTime   | S     |
| LocalTime | of(hour: int, minute: int, second: int)    | LocalTime   | S     |
| LocalTime | parse(text: CharSequence)                  | LocalTime   | S     |

**java.util**

| Klasse      | Methode                     | Rückgabetyp   | Level |
| ----------- | --------------------------- | ------------- | ----- |
| Enumeration | valueOf(arg0: String)       | Enumeration   | S     |
| Enumeration | values()                    | Enumeration[] | S     |
| List<E>     | add(e: E)                   | boolean       |       |
| List<E>     | add(index: int, element: E) | void          |       |
| List<E>     | contains(o: Object)         | boolean       |       |
| List<E>     | get(index: int)             | E             |       |
| List<E>     | of(elements: E...)          | List<E>       | S     |
| List<E>     | remove(index: int)          | E             |       |
| List<E>     | remove(o: Object)           | boolean       |       |
| List<E>     | size()                      | int           |       |
| Scanner     | hasNextLine()               | boolean       |       |
| Scanner     | next()                      | String        |       |
| Scanner     | nextBoolean()               | boolean       |       |
| Scanner     | nextDouble()                | double        |       |
| Scanner     | nextInt()                   | int           |       |
| Scanner     | nextLine()                  | String        |       |

**java.io**

| Klasse      | Methode            | Rückgabetyp | Level |
| ----------- | ------------------ | ----------- | ----- |
| PrintStream | print(obj: Object) | void        |       |
| PrintStream | println()          | void        |       |
| PrintStream | println(x: Object) | void        |       |
