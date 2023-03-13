//Задача 1
//Создать класс Pet (домашнее животное). В классе должны быть:
//
//enum Kind для вида животного (DOG, CAT, OTHER);
//поля:
//"вид животного" (тип Kind),
//"кличка" (тип String),
//"дата рождения" (тип String),
//вес (тип double);
//конструктор, сеттеры, геттеры;
//статический метод для создания животного при прочтении данных из строки "dog,кличка",
// "cat,кличка,вес", "turtle,кличка,вес,дата рождения".

//Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//
//Формат входных данных:
// количество строк с записями о домашних животных, затем сами записи в описанном формате.

package Task1Pet;

import java.util.ArrayList;
import java.util.List;

public class Pet {

  final private static char SEP = ',';

  enum Kind {
    DOG,
    CAT,
    OTHER,
  }

  private Kind type;

  private String name;

  private String birthday = null;

  double weight = 0.0;

  public Pet(Kind type, String name, double weight, String birthday) {
    this.type = type;
    this.name = name;
    this.weight = weight;
    this.birthday = birthday;
  }

  public Pet(Kind type, String name, double weight) {
    this.type = type;
    this.name = name;
    this.weight = weight;
  }

  public Pet(Kind type, String name) {
    this.type = type;
    this.name = name;
  }

  public Kind getKind() {
    return type;
  }

  public String getName() {
    return name;
  }

  public String getBirthday() {
    return birthday;
  }

  public double getWeight() {
    return weight;
  }

  public void setKind(Kind type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  private static boolean checkKindParameter(String line) {

    boolean flagForKind = false;
    String typeString = line.substring(0, line.indexOf(SEP)).toUpperCase();

    if (typeString.equals("CAT")) {
      flagForKind = true;
    } else if (typeString.equals("DOG")) {
      flagForKind = true;
    }
    return flagForKind;
  }

  private static int counter(String line) {
    int counter = 0;
    char[] lineSymbols = line.toCharArray();

    for (int sym = 0; sym < line.length(); ++sym) {
      if (lineSymbols[sym] == SEP) {
        counter++;
      }
    }
    return counter;
  }

  public static Pet parsePet(String line) {

    int counter = counter(line);
    char[] lineSymbols = line.toCharArray();
    List<Integer> sepPosition = new ArrayList<>();

    for (int sym = 0; sym < line.length(); ++sym) {
      if (lineSymbols[sym] == SEP) {
        sepPosition.add(sym);
      }
    }

    Kind type = Kind.OTHER;
    String name = null;
    double weight = 0.0;
    String birthday = null;

    switch (counter) {
      case (0) -> System.err.println("Incorrect input data");
      case (1) -> {
        if (checkKindParameter(line)) {
          type = Kind.valueOf(line.substring(0, sepPosition.get(0)).toUpperCase());
        }
        name = line.substring(sepPosition.get(0) + 1);
      }
      case (2) -> {
        if (checkKindParameter(line)) {
          type = Kind.valueOf(line.substring(0, sepPosition.get(0)).toUpperCase());
        }
        name = line.substring(sepPosition.get(0) + 1, sepPosition.get(1));
        weight = Double.parseDouble(line.substring(sepPosition.get(1) + 1));
      }
      case (3) -> {
        if (checkKindParameter(line)) {
          type = Kind.valueOf(line.substring(0, sepPosition.get(0)).toUpperCase());
        }
        name = line.substring(sepPosition.get(0) + 1, sepPosition.get(1));
        weight = Double.parseDouble(line.substring((sepPosition.get(1) + 1), sepPosition.get(2)));
        birthday = line.substring(sepPosition.get(2) + 1);
      }
    }

    Pet result = new Pet(type, name, weight, birthday);
    return result;
  }
}