
package Lab1;

import java.util.Scanner;

import Lab1.modules.*;

public class MainProgram {
    /**
     * {@link}
     * https://docs.google.com/document/d/142bHTKHvZCyG4WhowSjvenW-JGprnjcrNW4iujb-crc/edit
     *
     * {@summary}
     * StudentId - КВ13879017 C5 = 2 C7 = 5 C11 = 9
     *
     * Element type - char
     * C = A+B
     * Знайти середнє значення елементів кожного стовпчика
     */

    public static void main(String args[]) {
        char[][] matrix1 = {
                {
                        'a', 'b', 'c'
                },
                {
                        'd', 'e', 'f'
                },
                {
                        'g', 'h', 'i'
                }
        };

        char[][] matrix2 = {
                {
                        'i', 'h', 'g'
                },
                {
                        'f', 'e', 'd'
                },
                {
                        'c', 'b', 'a'
                }
        };


        try {
            System.out.println("Matrix 1");
            MatrixOperations.printMatrix(matrix1);

            System.out.println("Matrix 2");
            MatrixOperations.printMatrix(matrix2);


            char[][] sumResult = MatrixOperations.sum(matrix1, matrix2);


            System.out.println("Matrix sum");
            MatrixOperations.printMatrix(sumResult);


            System.out.println("Average value of matrix columns");
            char[] columnAverageResult = MatrixOperations.findColumnAverage(sumResult);
            MatrixOperations.printArray(columnAverageResult);

        } catch (MatrixOperationException error) {
            System.out.println(error.getMessage());
        }
    }
}
