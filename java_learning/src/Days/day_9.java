package Days;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

import Helpers.PrintHelpers;

public class day_9 {
    static Scanner user_input = new Scanner(System.in);
    public static final String ANSI_RED   = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN   = "\u001B[36m";

    public static void main(String[] args) {
        calculations_new();
        calculations_older();
    }

    public static void calculations_older(){
        int[] array_1;
        int[] array_of_numbers = new int[5];

        array_of_numbers[0] = 95;

        String[] array_of_names = {"Senan", "Rahat", "Qulamov"};

        for(int i = 1; i < array_of_numbers.length; i++){
            System.out.println("Enter any number less than " + array_of_numbers[0]);
            array_of_numbers[i] = Integer.parseInt(user_input.nextLine());
        }

        System.out.println("Your complexity will be like: ");
        System.out.println(Arrays.toString(array_of_numbers));


        // List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        // System.out.println(list);
    }

    public static void calculations_new(){
        int[] array_of_nums = new int[10];

        for (int i = 0; i < array_of_nums.length; i++) {
            array_of_nums[i] = i;
        }

        PrintHelpers.draw_line();

        for (int j = 0; j < array_of_nums.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");

        PrintHelpers.draw_line();

        String[][] array_of_2d = new String[10][10];

        for (int i = 0; i < array_of_2d.length; i++) {
            for (int j = 0; j < array_of_2d[i].length; j++) {
                array_of_2d[i][j] = i + "" + j;
                if(Objects.equals(array_of_2d[i][j], "10")){
                    System.out.print("| " + ANSI_CYAN + array_of_2d[i][j] + ANSI_RESET + " |");
                }else{
                    System.out.print("| " + ANSI_RED + array_of_2d[i][j] + ANSI_RESET + " |");
                }

            }
            System.out.println();
        }

        PrintHelpers.draw_line();
        PrintHelpers.build_star_map(true);
        PrintHelpers.draw_line();
    }
}
