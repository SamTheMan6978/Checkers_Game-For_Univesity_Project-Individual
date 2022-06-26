
// Class responsible for processing all inputs
public class move_List_Processing {

    public static void Move_Process(char[][] Checker_Board, char user_Checker_Input, String[] player_Move_List) {

        String [][] checkers_Numbered_Board = {

                {"-", "1", "-", "2", "-", "3", "-", "4"},
                {"5", "-", "6", "-", "7", "-", "8", "-"},
                {"-", "9", "-", "10", "-", "11", "-", "12"},
                {"13", "-", "14", "-", "15", "-", "16", "-"},
                {"-", "17", "-", "18", "-", "19", "-", "20"},
                {"21", "-", "22", "-", "23", "-", "24", "-"},
                {"-", "25", "-", "26", "-", "27", "-", "28"},
                {"29", "-", "30", "-", "31", "-", "32", "-"},
        };

        // Instantiated variables
        String first_Position = "";

        char[] white_Pieces = new char[2];
        white_Pieces[0] = 'W';
        white_Pieces[1] = 'w';

        char[] black_Pieces = new char[2];
        black_Pieces[0] = 'B';
        black_Pieces[1] = 'b';

        // A recursive loop function to loop through the move list and place checkers as per criteria

        for (int i = 0; i < player_Move_List.length; i++)
            for (int j = 0; j < Checker_Board.length; j++)
                for (int k = 0; k < Checker_Board[j].length ; k++)
                    for (int l = 0; l < checkers_Numbered_Board.length; l++)
                        for (int m = 0; m < checkers_Numbered_Board[l].length; m++) {

                            // First position derived from te String
                    first_Position = player_Move_List[i].substring(0, 2);


                    // Conditional Statement to analyse whether the position is a single digit, or double digit.
                    if (first_Position.contains("x") || first_Position.contains("-"))
                        first_Position = player_Move_List[i].substring(0, 1);


                    // Conditional statement to assess whether to place a white or black checker piece based on initial user checker input

                    if (user_Checker_Input == 'w') {
                        if (first_Position == checkers_Numbered_Board[l][m])

                            Checker_Board[j][k] = white_Pieces[(int) (Math.random() * 2)];
                        break;
                    }
                    else {
                        Checker_Board[j][k] = black_Pieces[(int) (Math.random() * 2)];
                    }

                }
        System.out.println(first_Position);


        // Function to print out the graph after all changes
        for (int i = 0; i < 64; i++) {
            int x = i % 8;
            int y = (i - x) / 8;
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(Checker_Board[x][y]);
        }

        }
    }
