/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a complete static method that finds the largest value in a 2-dimension array of ints.
 * The method should have one parameter, which is a 2d array of type int. The largest number
 * in the array should be returned as the value of the method.
 *
 * INPUT: user input a 2-dimension array of type int
 * OUTPUT: the largest number in input array
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * Input: 4  6  8
 *        5  8  9
 *        2  1  8
 * Output: 9
 *
 */

import java.util.Scanner;

public class Q4_GetMax {
    /* place your code here */
    public static int maximizer(int[][] matrix){
        int maximum_value = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > maximum_value){
                    maximum_value = matrix[i][j];
                }
            }
        }
        return maximum_value;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please input the number of rows the matrix is to have");
        int rows = input.nextInt();
        System.out.println("Please input the number of columns the matrix is to have");
        int columns = input.nextInt();
        int[][] given_matrix = new int[columns][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println("What is the entry at row " +(i+1) +" and column " +(j+1));
                given_matrix[i][j] = input.nextInt();


            }
        }
        System.out.println(maximizer(given_matrix));
    }
}
