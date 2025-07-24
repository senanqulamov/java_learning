package Days;

import java.util.Scanner;

public class day_5 {

    static final double PI = 3.14159;
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        int a = user_input.nextInt();

        if(a != 0){
            scanner_checker(a);
        }
    }

    public static void scanner_checker(int time_detected){
        System.out.println("Checking your keyboard");

        for (int i = 0; i <= time_detected; i++) {
            System.out.println("Time left: " + i);
        }

        System.out.println("There is no any problems found , PI is " + PI);
    }

}
