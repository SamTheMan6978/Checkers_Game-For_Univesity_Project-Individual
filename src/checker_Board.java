// Class responsible for holding the initial board
public class checker_Board {

    public static char[][] Checker_Board() {

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

        // Printing function for initial Graph (for comparison)
        for (int i = 0; i < 64; i++) {
            int x = i % 8;
            int y = (i - x) / 8;
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(checkers_Board_OG[x][y]);
        }
        return checkers_Board_OG;
    }
}
