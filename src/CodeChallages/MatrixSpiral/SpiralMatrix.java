package CodeChallages.MatrixSpiral;

public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftColumn = 0;
        int rightColumn = columns - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            // Print top row
            for (int i = leftColumn; i <= rightColumn; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            // Print right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
            }
            rightColumn--;

            // Print bottom row
            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            // Print left column
            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftColumn] + " ");
                }
                leftColumn++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printSpiralMatrix(matrix);
    }
}
