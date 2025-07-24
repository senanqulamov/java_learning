package Objects;

public class Car {

    private final String owner_name = "Senan Qulamov";
    private final int manufacturer_id = 12345431;

    public int manufaction_year = 2025;
    public int car_speed = 160;
    public int car_acceleration = 200;
    public int car_gear = 2;
    public double car_engine = 2.2;
    public double car_fuel_capacity = 20;
    public boolean sold = false;

    public String car_name = "New Year Car";
    public String car_brand = "BMW";
    public String car_model = "X6";

    //Constructor
    public Car(String car_brand, String car_model, String car_name){
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_name = car_name;
    }

    public Car(int car_speed, int car_acceleration, int car_gear){
        this.car_speed = car_speed;
        this.car_acceleration = car_acceleration;
        this.car_gear = car_gear;
    }

    //Default Constructor
    public Car(){

    }

    public int start_engine(){
        int engine = 0;
        engine = (car_acceleration * car_gear)/car_speed;

        return engine;
    }

    public void show_price(){
        double price = 0;

        price = (double) manufaction_year + (car_gear * car_speed * car_engine)/car_acceleration;

        System.out.println(price);
    }

    public int car_movement(){
        int movement = 0;
        movement = (int) (car_acceleration * car_gear)/car_speed;

        return movement;
    }

    public void show_secret(){
        System.out.println("Secret key: " + this.manufacturer_id);
        System.out.println("Secret name: " + this.owner_name);
    }
}
