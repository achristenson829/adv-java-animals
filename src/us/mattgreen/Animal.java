package us.mattgreen;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Animal{

    private String name;
    private Scanner s = new Scanner(System.in);

    public Animal(){

    }

    public Talkable getInput() {

        System.out.println("What type of animal do you want to create? 1) Dog 2) Cat 3) Teacher");
        int option;
        while (!s.hasNextInt()) {
            String input = s.next();
            System.out.printf("\"%s\" is not a valid number Enter valid number.%n", input);
        }
        option = s.nextInt();
        Talkable newAnimal = null;
        switch (option) {
            case 1:
            System.out.println("What is the dog's name?");
            name = s.nextLine();
            System.out.println("Are they friendly? (y) yes or (n) no");
            String isFriendly = s.nextLine();
            while (!isFriendly.equals("y") && !isFriendly.equals("n")){
                System.out.println("Invalid input! Enter (y) for yes or (n) for no");
                isFriendly = s.nextLine();
            }
            if (Objects.equals(isFriendly, "y")) {
                newAnimal = new Dog(true, name);

            } else{
                newAnimal = new Dog(false, name);
            }
            break;
            case 2:
            System.out.println("What is the cat's name?");
            Scanner sc3 = new Scanner(System.in);
            name = sc3.nextLine();
            System.out.println("How many mice have they killed?");
            Scanner sc4 = new Scanner(System.in);
            int kills = Integer.parseInt(sc4.nextLine());
            newAnimal = new Cat(kills, name);
            break;
            case 3:
            System.out.println("What is the teachers name?");
            Scanner sc5 = new Scanner(System.in);
            name = sc5.nextLine();
            System.out.println("What is the teacher's age?");
            Scanner sc6 = new Scanner(System.in);
            int age = Integer.parseInt(sc6.nextLine());
            newAnimal = new Teacher(age, name);
            break;
            default:
                System.out.println("Invalid input! Enter a valid number");
                option = s.nextInt();
        }
        return newAnimal;
    }

}
