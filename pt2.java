package backtracking;
public class pt2 {
    public static void main(String[] args) {
        int rows = 5;
        String[][] pyramid = new String[rows][2 * rows - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                pyramid[i][j] = "  ";
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j=rows-1-i; j<=rows-1+i;j+= 2) {
                pyramid[i][j] = "* ";
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                System.out.print(pyramid[i][j]);
            }
            System.out.println();
        }
    }
}
