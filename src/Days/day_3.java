package Days;

public class day_3 {
    public static void main(String[] args) {
        int rand_1 = (int) (Math.random() * 50);

        System.out.println("Random Number: " + rand_1);

        if(rand_1 <= 25){
            System.out.println("rand is less than 25");
        }else{
            System.out.println("rand is greater than 25");
        }

        if(!(rand_1 <= 25) && (rand_1 <= 50)){
            System.out.println("rand is less than 0");
        }

        if(!(false) || (true)){
            System.out.println("rand is greater than true");
        }

        int value_1 = 1;
        int value_2 = 2;
        int big_value;

        // ternary conditional operator
        big_value = (value_1 > value_2) ? value_1 : value_2;
        // or simply: big_value = Math.max(value_1, value_2);
        System.out.println(big_value);

        switch(big_value) {
            case 1:
                System.out.println("rand is less than 1");
                break;
            case 2:
                System.out.println("rand is greater than 2");
                break;
            default:
                System.out.println("rand is less than 0");
                break;
        }
    }
}
