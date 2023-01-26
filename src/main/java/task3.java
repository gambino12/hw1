public class task3 {
    public static void main(String[] args) {
      int [][]matrix = CreateMatrix(5);
      PrintMAtrix(matrix);
      findMainDiagonalSum(matrix);
      findSecondaryDiagonalSum(matrix);

    }

    public static int[][] CreateMatrix(int num) {
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int r = (int) (Math.random() * 6);
                matrix[i][j] = r;
            }
        }
        return matrix;
    }

    public static void PrintMAtrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  " );
            }

        }
        System.out.println("");
    }
    public  static void findMainDiagonalSum(int[][] matrix){ /// O(n)
        int sumofdiagonal = 0;
        for (int i = 0; i < matrix.length ; i++) {
            sumofdiagonal +=matrix[i][i];
        }

        System.out.println(sumofdiagonal);
    }
    public  static void findSecondaryDiagonalSum(int[][] matrix){ /// O(n)
        int sumofdiagonal = 0;
        for (int i = matrix.length-1; i >= 0; i--) {
            sumofdiagonal += matrix[i][matrix.length - 1 - i];
        }
        System.out.println(sumofdiagonal);
    }
}
