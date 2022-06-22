import java.util.Scanner;

public class user_Checker_Input {
    public static char user_Checker_Function() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your player checker (W/B only): ");
        char user_Checker = input.next().charAt(0);

        while (true) {
            if (user_Checker != 'B' && user_Checker != 'W') {
                System.out.println("Incorrect input, please input either 'W' or 'B' capitalised: ");
                user_Checker = input.next().charAt(0);
            } else
                return user_Checker;
        }
    }
}