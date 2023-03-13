package Task1Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    List<String> dataAboutPet = getDataFromConsol();
    printResult(dataAboutPet);
  }

  private static List<String> getDataFromConsol() throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(read.readLine());
    List<String> dataAboutPet = new ArrayList<>();

    for (int i = 0; i < number; ++i) {
      dataAboutPet.add(read.readLine());
    }

    return dataAboutPet;
  }

  private static void printResult(List<String> dataAboutPet) {

    for (String pet : dataAboutPet) {
      try {
        Pet onePet = Pet.parsePet(pet);
        System.out.printf("%s, %s, %s, %s%n",
            onePet.getKind(), onePet.getName(), onePet.getWeight(), onePet.getBirthday());
      } catch (NumberFormatException e) { //it is part of next Exception, but text is other
        System.out.println("Needs Double format of data =" + e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("Incorrect input data =" + e.getMessage());
      }
    }
  }
}
