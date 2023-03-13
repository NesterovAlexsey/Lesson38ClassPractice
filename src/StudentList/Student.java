package StudentList;

public class Student {

  public static int counter = 0; // простой способ создания id
  final private static char SEP = ',';

  final private int id;
  private String name;
  String group;
  String eMail = null;

  public Student(String name, String group) {
    this.id = ++counter;
    this.name = name;
    this.group = group;
  }

  public Student(String name, String group, String eMail) {
    this.id = ++counter;
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

  public String getEMail() {
    return eMail;
  }

  public static Student parseStudent(String group, String line) {
    int sepIndex = line.indexOf(SEP);
    if (sepIndex != -1) {
      String name = line.substring(0, sepIndex);
      String eMail = line.substring(sepIndex + 1);
      return new Student(name, group, eMail);
    }
    return new Student(/*name*/line, group);
  }
}

