import java.util.Scanner;

public class user_Moves {
    public static int user_No_Of_Moves() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number of moves (1-100): ");
        int no_Of_Moves = input.nextInt();

        while (true) {
            if (1 <= no_Of_Moves && no_Of_Moves <= 100) {
                return no_Of_Moves;
            } else {
                System.out.println("Your number of moves are invalid, the range is from 1 to 100: ");
                no_Of_Moves = input.nextInt();
            }
        }
    }
}