package Oct.ex_30102024_Arrays;


public class Lab135_Arrays_2D_Iterate {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // R - 3
        // R -> C -> 3

        System.out.println("matrix.length: "+ matrix.length);

        for (int i = 0; i < matrix.length; i++) { // matrix.length
            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length
                System.out.print(matrix[i][j]);
            }
        }
// difference b/w matrix.length & matrix[i].length
        // difference b/w matrix.length & matrix.length() - with and without brackets


    }

}
