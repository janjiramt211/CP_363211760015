package Lab2;

import java.util.Scanner;

public class BasicInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("Your name is "+name);
        String Major;
        System.out.print("What is your major? : ");
        Major = scanner.nextLine();
        System.out.println("Your major is "+Major);
        String age;
        System.out.print("What is your age? : ");
        age = scanner.nextLine();
        System.out.println("Your age is "+age);
        String email;
        System.out.print("What is your email? : ");
        email = scanner.nextLine();
        System.out.println("Your email is "+email);






    }//main
}//class
