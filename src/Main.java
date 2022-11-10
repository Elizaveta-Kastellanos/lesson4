import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
          try {
              List<People> people = new ArrayList<>();
              int count = 0;
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter counter people: ");
                  count = sc.nextInt();
                  sc.nextLine();
                  for(int i = 0;i<count;i++) {
                      boolean check = true;
                      String firstname = "";
                      String lastname = "";
                      String patronymic = "";
                      String gender = "";
                      int age = 0;
                      while (check) {
                          System.out.println("Enter firstname: ");
                          firstname = sc.nextLine();
                          if (firstname.length() == 0 || firstname.length() == 1) {
                              System.out.println("You entered an empty string");
                          } else if (firstname.length() > 30) {
                              System.out.println("The name cannot contain more than 30 characters");
                          } else {
                              check = false;
                          }
                      }
                      check = true;
                      while (check) {
                          System.out.println("Enter lastname: ");
                          lastname = sc.nextLine();
                          if (lastname.length() == 0 || lastname.length() == 1) {
                              System.out.println("You entered an empty string");
                          } else if (lastname.length() > 30) {
                              System.out.println("The lastname cannot contain more than 30 characters");
                          } else {
                              check = false;
                          }
                      }
                      check = true;
                      while (check) {
                          System.out.println("Enter patronymic: ");
                          patronymic = sc.nextLine();
                          if (patronymic.length() == 0 || patronymic.length() == 1) {
                              System.out.println("You entered an empty string");
                          } else if (patronymic.length() > 30) {
                              System.out.println("The patronymic cannot contain more than 30 characters");
                          } else {
                              check = false;
                          }
                      }

                      System.out.println("Enter your age: ");
                      age = sc.nextInt();
                      sc.nextLine();
                      check = true;
                      while (check) {
                          System.out.println("What's your gender: women, man or indefinite");
                          gender = sc.nextLine();
                          if (gender.equals(Genders.woman.name()) || gender.equals(Genders.man.name()) ||
                                  gender.equals(Genders.indefinite.name())) {
                              check = false;
                          } else {
                              System.out.println("Enter correctly please: ");
                          }
                      }
                      if(gender.equals("woman")){
                          people.add(new People(firstname,lastname,patronymic,age,Genders.woman));
                      } else if(gender.equals("man")){
                          people.add(new People(firstname,lastname,patronymic,age,Genders.man));
                      } else{
                          people.add(new People(firstname,lastname,patronymic,age,Genders.indefinite));
                      }

                  }
                  Collections.sort(people);
                  System.out.println(people);
          }
          catch(Exception ex){
              System.out.println(ex.getMessage() + "\nYou enter not number(");
          }
    }
}