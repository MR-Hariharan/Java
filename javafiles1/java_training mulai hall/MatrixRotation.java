public class MatrixRotation {
        public static void rotateClockwise(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                reverseRow(matrix[i]);
            }
        }
        private static void reverseRow(int[] row) {
            int left = 0;
            int right = row.length - 1;
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
        public static void rotateCounterclockwise(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int j = 0; j < n; j++) {
                reverseColumn(matrix, j);
            }
        }
        private static void reverseColumn(int[][] matrix, int col) {
            int top = 0;
            int bottom = matrix.length - 1;
            while (top < bottom) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
                top++;
                bottom--;
            }
        }
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Original Matrix:");
            printMatrix(matrix);
            rotateClockwise(matrix);
            System.out.println("\nMatrix after 90 degrees clockwise rotation:");
            printMatrix(matrix);
            rotateCounterclockwise(matrix);
            System.out.println("\nMatrix after 90 degrees counterclockwise rotation:");
            printMatrix(matrix);
        }
    }

