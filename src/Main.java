import Days.day_9;
import Helpers.*;
import java.util.*;
import static Methods.CustomMethods.*;

public class Main {
    public static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        LoginWithUserName();

        System.out.print("Sum factorial of: ");
        int factorial_input = user_input.nextInt();
        int factorial = CalculationHelpers.factorial(factorial_input);

        System.out.println("Sum of factorial: " + factorial);
    }
}