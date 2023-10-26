/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */

import java.util.Scanner;
import java.util.Arrays;

public class Q3_TransposeMatrix {
    /* place your subroutine code here */

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please input the number of rows the matrix has");
        int rows = input.nextInt();
        System.out.println("Please input the number of columns the matrix has");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < columns; j++){
                System.out.println("Please input the entry in row " +(i+1) +" and column " + (j+1));
                int entry = input.nextInt();
                matrix[i][j] = entry;
            }

        }
        int[][] transposed_matrix = new int[columns][rows];
        for(int i = 0; i <columns; i++){
            int[] new_row = new int[columns];
            for(int j = 0; j < rows; j++){
                new_row[j] = matrix[j][i];
                
            }
            transposed_matrix[i] = new_row;

        }

        System.out.println("Here is the transposed matrix!");
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(transposed_matrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}
