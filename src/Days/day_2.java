package Days;

import java.util.Scanner;

public class day_2 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert a number: ");
        int num = 0;

        if(userInput.hasNextInt()){ //check if user input is integer
            int user_number = userInput.nextInt();

            for (int i = 1; i <= user_number; i++) {
                num += i;
                System.out.print(num + "->");
            }

            System.out.println("The factorial is: " + num);
            System.out.println(Math.abs(user_number));
        }else{
            System.out.println("Please enter a number");
        }


    }
}
