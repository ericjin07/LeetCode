package backtracking.eightQueen;

import java.util.Arrays;

public class EightQueen {
    private static final int LENGTH = 8;
    private static int[] tab = new int[LENGTH];
    static {
        Arrays.fill(tab, -1);
    }

    public void calEightQueen(int row) {
        if (row == LENGTH) {
            printEightQueen();
            return;
        }

        for (int i = 0; i < LENGTH; i++) {
            if (isOk(row, i)) {
                tab[row] = i;
                calEightQueen(row + 1);
            }
        }
    }

    private boolean isOk(int row, int col) {
        int leftUp = col - 1, rightUp = col + 1;
        for (int i = row - 1; i >= 0 ; i--) {
            if (tab[i] == col) return false; // up
            if (leftUp >= 0 && tab[i] == leftUp--) return false;
            if (rightUp < LENGTH && tab[i] == rightUp++) return false;
        }
        return true;
    }

    private void printEightQueen() {
        for (int r = 0; r < LENGTH; r++) {
            for (int c = 0; c < LENGTH; c++) {
                if (tab[r] == c) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        EightQueen queen = new EightQueen();
        queen.calEightQueen(0);
    }

}
