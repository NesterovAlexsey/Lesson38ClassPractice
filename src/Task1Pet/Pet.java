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

  private String birthday = null;

  double weight = 0.0;

  public Pet(Kind type, String name, String birthday, double weight) {
    this.type = type;
    this.name = name;
    this.birthday = birthday;
    this.weight = weight;
  }

  public Pet(Kind type, String name, String birthday) {
    this.type = type;
    this.name = name;
    this.birthday = birthday;
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


}
