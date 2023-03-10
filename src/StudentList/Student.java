// написать базу данных студентов
// студенты могут находиться в группах

// прочитать количество групп
// для каждой группы:
// - прочитать количество студентов
// - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
// красиво вывести состав групп на экран

package StudentList;

public class Student {

  final private static char SEP = ',';

  private int id;
  private String name;
  String group;
  String eMail = null;

  public Student(String name, String group) {
    this.name = name;
    this.group = group;
  }

  public Student(String name, String group, String eMail) {
    this.name = name;
    this.group = group;
    this.eMail = eMail;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public String getName() {
    return name;
  }

  public String getGroup() {
    return group;
  }

  public String geteMail() {
    return eMail;
  }

  public static Student parseStudent(String group, String line) {
    int sepIndex = line.indexOf(SEP);
    if (sepIndex != -1) {
      String name = line.substring(0, sepIndex);
      String eMail = line.substring(sepIndex +1);
      return new Student(name, group, eMail);
    }
      return new Student(/*name*/line, group);
    }
  }
}
