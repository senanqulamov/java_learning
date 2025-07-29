package Days;

public class day_1{

    static String randomStr = "It's me";
    static final String randomStr_final = "Its me in str 2";
    public static void main(String[] args){

        int random_int_1,random_int_2;
        random_int_1 = 2;
        random_int_2 = 3;
        boolean randomBool = false;
        double aDouble = 2.11;
        char randomChar = 66;
        char randomChar_2 = 'a';

        // combining 2 Strings:
        String random_string = randomStr + " --- " + randomStr_final;

        // Changing variable types to String :
        String new_string_from_char = Character.toString(randomChar);
        String new_string_from_int = Integer.toString(random_int_1);
        String new_string_from_bool = Boolean.toString(randomBool);
        String new_string_from_float = Float.toString(randomChar);
        String new_string_from_double = Double.toString(aDouble);

        // Changing double and string to int:
        int int_fromDouble = (int) aDouble;
        int StringToInt = Integer.parseInt(new_string_from_int);


        System.out.println("random_string = " + random_string);
        System.out.println(StringToInt);
        System.out.println(Integer.MAX_VALUE);

        //learn escape characters
    }
}
