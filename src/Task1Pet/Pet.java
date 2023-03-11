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

public class Pet {

  enum Kind {
    DOG,
    CAT,
    OTHER,
  }

  private Kind type;

  private String name;

  private String birthday;

  double weight;

  public Pet(Kind type, String name, String birthday, double weight) {
    this.type = type;
    this.name = name;
    this.birthday = birthday;
    this.weight = weight;
  }

  public Pet(Kind type, String name) {
    this.type = type;
    this.name = name;
  }

}
