package Lab1;

import java.util.ArrayList;
import java.lang.StringBuilder;

import Lab1.MatrixOperationException;



public class MatrixOperations {
    /**
     * 
     * {@param} m1 - m1 matrix sized NxN
     * {@param} m2 - m2 matrix sized NxN
     * {@return} sum of 2 matrices
     */
    public static char[][] sum(char[][] m1, char[][] m2) throws MatrixOperationException {
        MatrixOperations.checkMatricesCompatible(m1, m2);

        int n = m1.length;


        char[][] sum = new char[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                sum[r][c] = (char) (m1[r][c] + m2[r][c]);
            }
        }

        return sum;
    };


    /**
     * {@summary} finds the average of every column in a matrix
     */
    public static char[] findColumnAverage(char[][] matrix)
            throws MatrixOperationException {

        MatrixOperations.checkMatrixSquare(matrix);
        int n = matrix.length;

        char[] averageColumn = new char[n];


        for (int r = 0; r < n; r++) {
            int thisColumnSum = 0;
            for (int c = 0; c < n; c++) {
                thisColumnSum += matrix[c][r];
            }
            averageColumn[r] = (char) thisColumnSum;
        }

        return averageColumn;
    };


    /**
     * {@summary} checks if 2 matrices are the same size and square
     */
    private static void checkMatricesCompatible(char[][] m1, char[][] m2)
            throws MatrixOperationException {
        MatrixOperations.checkMatrixSquare(m1);
        MatrixOperations.checkMatrixSquare(m2);

        if (m1.length != m2.length) {
            throw new MatrixOperationException("Matrices have to be the same size");
        }
    };

    private static void checkMatrixSquare(char[][] matrix) throws MatrixOperationException {
        int rows = matrix.length;
        int cols = matrix[0].length;


        if (cols != rows) {

            StringBuilder errorMsg = new StringBuilder("Matrix must be square: number of rows (");
            errorMsg.append(rows);
            errorMsg.append(") and number of cols (");
            errorMsg.append(cols);
            errorMsg.append(") do not mathch");

            throw new MatrixOperationException(errorMsg.toString());
        }

    }

    /**
     * {@summary} prints any rectangular char matrix to stdout
     */
    public static void printMatrix(char[][] matrix) {
        String output = new String("{\n");
        int row = matrix.length;
        int column = matrix[0].length;

        for (int r = 0; r < row; r++) {

            output += " {";
            for (int c = 0; c < column; c++) {
                output += " " + matrix[r][c];
            }
            output += " },\n";

        }
        output += "}";

        System.out.println(output);
    };

    /**
     * {@summary} prints char array to stdout
     */
    public static void printArray(char[] arr) {
        String output = new String("{");

        for (int r = 0; r < arr.length; r++) {
            output += " " + arr[r];
        }
        output += " }";

        System.out.println(output);
    };

}
