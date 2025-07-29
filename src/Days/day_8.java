package Days;

import java.util.*;
import Objects.Car;

public class day_8 {

    public static final String ANSI_RED   = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    static char[][] race_map = new char[10][10];
    static int positionX,positionY;
    static Car user_car = new Car(200 , 150 , 3);
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        place_car_on_map();
        System.out.println(user_car.car_movement());
        user_car.car_name = "Senan";

        build_race_map(positionX, positionY);
    }

    public static void build_race_map(int pX, int pY){
        for(char[] row : race_map){
            Arrays.fill(row, '*');
        }

        int a = 1;
        while(a <= 30){
            System.out.print('-');
            a++;
        }
        System.out.println();

        for(int i = 0; i < race_map.length; i++){
            for(int j = 0; j < race_map[i].length; j++){
                if(i == pY && j == pX){
                    race_map[i][j] = user_car.car_name.charAt(0);
                }
                if(race_map[i][j] == user_car.car_name.charAt(0)){
                    System.out.print("|" + ANSI_RED + race_map[i][j] + ANSI_RESET + "|");
                }else{
                    System.out.print("|" + race_map[i][j] + "|");
                }
            }
            System.out.println();
        }

        a = 1;
        while(a <= 30){
            System.out.print('-');
            a++;
        }
        System.out.println();

        System.out.println("Movement: " + user_car.car_movement());
        System.out.println("X Position: " + positionX);
        System.out.println("Y Position: " + positionY);

        System.out.print("Make your movement: ");
        char movement = user_input.next().charAt(0);
        movement = Character.toUpperCase(movement);
        move_car(movement);
    }

    public static void place_car_on_map(){
        int maxMapX = race_map.length - 1;
        int maxMapY = race_map[0].length - 1;

        int randomXposition = 0, randomYposition = 0;

        randomXposition = (int) (Math.random() * maxMapX);
        randomYposition = (int) (Math.random() * maxMapY);

        positionX = randomXposition;
        positionY = randomYposition;
    }

    public static void move_car(char movement){
        switch (movement){
            case 'U':
                System.out.println("Move your car: Up " + user_car.car_movement());
                positionY = positionY - user_car.car_movement();
                if(!(positionY < race_map.length && positionY > 0)){
                    System.out.println("Invalid movement , try again please");
                    break;
                }
                build_race_map(positionX, positionY);
                break;
            case 'D':
                System.out.println("Move your car: Down " + user_car.car_movement());
                positionY = positionY + user_car.car_movement();
                if(!(positionY < race_map.length && positionY > 0)){
                    System.out.println("Invalid movement , try again please");
                    break;
                }
                build_race_map(positionX, positionY);
                break;
            case 'L':
                System.out.println("Move your car: Left " + user_car.car_movement());
                positionX = positionX - user_car.car_movement();
                if(!(positionX < race_map[positionX].length && positionX > 0)){
                    System.out.println("Invalid movement , try again please");
                    break;
                }
                build_race_map(positionX, positionY);
                break;
            case 'R':
                System.out.println("Move your car: Right " + user_car.car_movement());
                positionX = positionX + user_car.car_movement();
                if(!(positionX < race_map[positionX].length && positionX > 0)){
                    System.out.println("Invalid movement , try again please");
                    break;
                }
                build_race_map(positionX, positionY);
                break;
            case 'E':
                System.out.println("Exited from race");
                break;
            default:
                System.out.println("Unknown movement");
                break;
        }
    }

    public static void place_map_cars(){
        Car[] map_cars = new Car[5];
        int pX , pY;

        for(int i = 0; i < 5; i++){
            pX = (int) (Math.random() * 0 * (race_map.length - i));
            pY = (int) (Math.random() * 0 * (race_map.length - i));
            System.out.println(pX + " - " + pY);

            int car_detail_random = (int) (Math.random() * (5 - i));

            map_cars[i] = new Car(20 * car_detail_random , 10 * car_detail_random , car_detail_random);
        }
    }
}
