package Task1Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(read.readLine());
    List<String> dataAboutPet = new ArrayList<>();

    for (int i = 0; i < number; ++i) {
      dataAboutPet.add(read.readLine());
    }

    System.out.println(dataAboutPet);

    //to do - catch NumberFormatException;

    String line = "dog,Чарли";
    Pet test = Pet.parsePet(line);

    String line2 = "cat,Веня,2.4";
    Pet test2 = Pet.parsePet(line2);

    String line3 = "turtle,Flash,3.0,2010";
    Pet test3 = Pet.parsePet(line3);

    System.out.printf("%s, %s, %s, %s%n",
        test.getKind(), test.getName(), test.getWeight(), test.getBirthday());
    System.out.printf("%s, %s, %s, %s%n",
        test2.getKind(), test2.getName(), test2.getWeight(), test2.getBirthday());
    System.out.printf("%s, %s, %s, %s%n",
        test3.getKind(), test3.getName(), test3.getWeight(), test3.getBirthday());

    // System.out.println(myPet.getKind() + myPet.getName() + myPet.getWeight() + myPet
    // .getBirthday());
    //,1.0,дата рождения
  }
}
