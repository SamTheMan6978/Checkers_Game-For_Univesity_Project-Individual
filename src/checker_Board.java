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
    }
}
