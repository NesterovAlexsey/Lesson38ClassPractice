package StudentList;

public class Student {

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
}
