package ReadingUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String currentYear = "2022";
        String usersDataOfBirth = "1999";

        System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(usersDataOfBirth)));
        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he is " + ageWithPartialYear);

        int currentYear2 = 2022;
//        System.out.println(getInputFromConsole(currentYear2));
//        System.out.println(getInputFromScanner(currentYear2));

        try {
            System.out.println(getInputFromConsole(currentYear2));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear2));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were your born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your name?");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were your born? ");
        System.out.println("What year were your born? ");
        String dateOfBirth = sc.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
}
