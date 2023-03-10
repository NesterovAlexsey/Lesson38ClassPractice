package StudentList;

public class Student {
  String name;
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
}
