//Задача 2* (не обязательно)
//Добавить в базу данных студентов чтение данных из файла.

package StudentList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("res/input.txt"));

    List<Student> students = new ArrayList<>();

    int groups = Integer.parseInt(br.readLine());
    for (int groupId = 0; groupId < groups; ++groupId) {
      readGroup(br, students);
    }
    for (Student student : students) {
      System.out.printf("%s (%s) в группе %s%n", student.getName(), student.getEMail(),
          student.getGroup());
    }
  }

  private static void readGroup(BufferedReader br, List<Student> students) throws IOException {
    String groupName = br.readLine();
    int studentsNumber = Integer.parseInt(br.readLine());
    for (int i = 0; i < studentsNumber; ++i) {
      String line = br.readLine();
      Student student = Student.parseStudent(groupName, line);
      students.add(student);
    }
  }
}
