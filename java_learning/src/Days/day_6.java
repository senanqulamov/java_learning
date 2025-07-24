package Days;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class day_6 {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        dividebyzero(6);
        int num = check_input();
        System.out.println("Your number is: " + num);

        check_file("test");
    }

    public static void dividebyzero(int a){
        try{
            System.out.println(a/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("Cannot divide by zero - math exception");
            e.printStackTrace();
        }
    }

    public static int check_input(){
        try{
            return user_input.nextInt();
        }catch (Exception e){
            user_input.next();
            System.out.println(e.getMessage());
            System.out.println(e.toString());

            return 0;
        }
    }

    public static void check_file(String file_name){
        try{
            FileInputStream fis = new FileInputStream(file_name);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }finally {
            System.out.println("---File not found---");
        }
    }

    public static void check_file_2(String file_name) throws IOException {
        FileInputStream fis = new FileInputStream(file_name);
    }
}
