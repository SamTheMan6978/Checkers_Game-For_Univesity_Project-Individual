import java.util.*;

public class player_Move_List {

    public static String [] player_Moves(int num_Of_Moves) {

        Scanner input = new Scanner(System.in);
        String[] user_Move_Input = new String[num_Of_Moves];

        for (int i = 0; i < num_Of_Moves; i++) {

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
}
