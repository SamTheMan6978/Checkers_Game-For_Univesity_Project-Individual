public class checker_Board {

    public static void randomized_Checker_Board() {

        char[][] checkers_Board_OG = {

                {'-', '.', '-', '.', '-', '.', '-', '.'},
                {'.', '-', '.', '-', '.', '-', '.', '-'},
                {'-', '.', '-', '.', '-', '.', '-', '.'},
                {'.', '-', '.', '-', '.', '-', '.', '-'},
                {'-', '.', '-', '.', '-', '.', '-', '.'},
                {'.', '-', '.', '-', '.', '-', '.', '-'},
                {'-', '.', '-', '.', '-', '.', '-', '.'},
                {'.', '-', '.', '-', '.', '-', '.', '-'},
        };

        int randomizer_Counter;

        char[] white_Pieces = new char[2];
        white_Pieces[0] = 'W';
        white_Pieces[1] = 'w';

        char[] black_Pieces = new char[2];
        black_Pieces[0] = 'B';
        black_Pieces[1] = 'b';

        // Printing function for initial Graph
        for (int i = 0; i < 64; i++) {
            int x = i % 8;
            int y = (i - x) / 8;
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(checkers_Board_OG[x][y]);
        }

        System.out.print("\n");

        for (int i = 0; i < checkers_Board_OG.length; i++)
            for (int j = 0; j < checkers_Board_OG[i].length; j++) {

                randomizer_Counter = (int) (Math.random() * 3);

                if (checkers_Board_OG[i][j] == '.') {
                    if (randomizer_Counter == 0)
                        checkers_Board_OG[i][j] = white_Pieces[(int) (Math.random() * 2)];
                    else if (randomizer_Counter == 1)
                        continue;
                    else
                        checkers_Board_OG[i][j] = black_Pieces[(int) (Math.random() * 2)];
                }

                if (checkers_Board_OG[i][7] == 'b' || checkers_Board_OG[i][7] == 'B') {
                    checkers_Board_OG[i][7] = '.';
                }

                if (checkers_Board_OG[i][0] == 'w' || checkers_Board_OG[i][0] == 'W') {
                    checkers_Board_OG[i][0] = '.';
                }
            }

        for (int i = 0; i < 64; i++) {
            int x = i % 8;
            int y = (i - x) / 8;
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(checkers_Board_OG[x][y]);
        }
    }
}
