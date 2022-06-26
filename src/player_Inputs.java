import java.util.*;

public class player_Inputs {

    // Method responsible for getting players moves
    public static int player_Moves_Input() {

        Scanner input = new Scanner(System.in);
        int no_Of_Moves;

        System.out.println("Please enter your number of moves (1-100): ");
        no_Of_Moves = input.nextInt();
        while (true) {
            if (1 <= no_Of_Moves && no_Of_Moves <= 100)
                break;

            else {
                System.out.println("Your number of moves are invalid, the range is from 1 to 100: ");
                no_Of_Moves = input.nextInt();
            }
        }
    return no_Of_Moves;}


    // Method responsible for getting the player move list into a String Type Array
        public static String [] player_Move_List_Input(int no_Of_Moves) {

            String[] user_Move_Input = new String[no_Of_Moves];
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < no_Of_Moves; i++) {

                System.out.println("Please enter your move: ");
                user_Move_Input[i] = input.nextLine();

                while (true) {
                    if (user_Move_Input[i].contains("-") || user_Move_Input[i].contains("x"))
                        break;

                    else {
                        System.out.println("Your move input is incorrect, kindly use 'x' for a jump and '-' for a move: ");
                        user_Move_Input[i] = input.nextLine();
                    }
                }
            }
            return user_Move_Input;
        }

        // Method responsible for getting the user checker for the first mover
    public static char user_Checker_Input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your player checker (w/b only): ");
        char user_Checker = input.next().charAt(0);

        while (true) {
            if (user_Checker != 'w' && user_Checker != 'b') {
                System.out.println("Incorrect input, please input either 'w' or 'b' capitalised: ");
                user_Checker = input.next().charAt(0);
            } else
                return user_Checker;
        }
    }
}
