package Loops.Training;

import java.util.Scanner;

public class TextScanner {
    public static void main(String[] args) {
        Scanner userValue = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userValue.next();
        System.out.println("Hi " + name);

        System.out.println("How old are you? ");
        int n = userValue.nextInt(); //to jest to samo co Integer.parseInt(userValue.next()
        System.out.print("Your age is " + n);

    }
}
