package Days;

import java.util.Scanner;

public class day_4 {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter your number: ");
        int user_num = user_input.nextInt();
        int sum = 0;

        for (int i = 0; i <= user_num; i++) {
            sum += i;
            if(sum < 20){
                System.out.println("Still less than 20-->" + sum);
            }else{
                System.out.println("Sum is 20 already");
                break;
            }
        }
        System.out.println("your sum is " + sum);

        int j = 0;
        while(j <= user_num){
            if(j == 4){
                j+=1;
                continue;
            }
            System.out.println("j = " + j);
            j++;

            if((j % 2) == 0){
                System.out.println("odd j = " + j);
            }else{
                System.out.println("even j = " + j);
            }
        }

        int py_value = py_calculator(user_num);
        System.out.println("The calculated py is: " + py_value);


        System.out.println(string_generator(sum));
    }

    public static int py_calculator(int py_stated){
        double py_num = 1.0;
        return (int) py_num;
    }

    public static String string_generator(int sum){
        String user_answer = "Y";
        int i = 1;

        while(user_answer.equalsIgnoreCase("Y")){
            System.out.println(i);
            System.out.println("enter yes/no: ");
            user_answer = user_input.next();
            i+= sum;
        }
        return "String generation finished";
    }
}
