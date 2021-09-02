import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Question 1
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name + "! I am ChatBot" );

        //Question 2
        System.out.println(name + ", What is your favorite baseball team?");
        String team = scan.nextLine();
        System.out.println("Oh cool, the " + team + " are a great team" );

        //Question 3
        System.out.println(name + ", how old are you?");
        String age = scan.nextLine();
        int year = Integer.parseInt(age);
        System.out.println("That must mean you were born in " + (2021-year) + "!" );

        //Question 4
        System.out.println(name + ", what is your favorite color?");
        String color = scan.nextLine();
        System.out.println(color + " sure is a great color!");

        //Question 5
        System.out.println(name + ", what city do you live in?");
        String city = scan.nextLine();
        System.out.println("I love " + city + "! It is such a great place." );

        //end
        System.out.println("Thanks for playing ChatBot, " + name + "!");








        scan.close();
    }
}
