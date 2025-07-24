package Days;

import Objects.Car;

public class day_7 {

    public static void main(String[] args){
        Car user_car = new Car();
        user_car.car_name = "Mercedes";

        user_car.show_price();

        System.out.println(user_car.start_engine() + " - minutes took to start the engine");
        System.out.println(user_car.car_name);

        user_car.show_secret();
    }
}
