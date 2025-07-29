package Helpers;

import java.util.Arrays;
import java.util.Scanner;

public class PrintHelpers {

    static Scanner user_input = new Scanner(System.in);
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_BLACK  = "\u001B[30m";
    public static final String ANSI_RED    = "\u001B[31m";
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN   = "\u001B[36m";
    public static final String ANSI_WHITE  = "\u001B[37m";

    public static void draw_line(){
        int k = 0;
        while(k<=80){
            System.out.print('_');
            k++;
        }
        System.out.println();
    }

    public static void build_star_map(boolean access){
        System.out.print("Please enter Star Map size as an Integer: ");
        int map_size = Integer.parseInt(user_input.next());
        int map_size_default = map_size;

        if(map_size > 20){
            map_size_default = map_size/3;
            System.out.println(map_size + " Divided by 3, because of optimization, new size is: " + map_size_default);
        }

        char[][] star_map = new char[map_size_default][map_size_default];

        for(char[] row : star_map){
            Arrays.fill(row, '*');
        }

        int map_size_1 = map_size / 10;
        int map_size_2 = map_size % 10;

        star_map[map_size_1 -1][map_size_2 -1] = 'S';


        for (char[] row : star_map) {
            for (char stage : row) {
                if (stage == 'S') {
                    System.out.print("|" + ANSI_CYAN + stage + ANSI_RESET + "|");
                }else{
                    System.out.print("|" + ANSI_YELLOW + stage + ANSI_RESET + "|");
                }
            }
            System.out.println();
        }
    }
}

