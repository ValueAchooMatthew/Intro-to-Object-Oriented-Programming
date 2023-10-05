/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static int numerator(int number) {
        int output = number + (number*10 +number) + (number*100 + number*10 +number);
        return output;
    }

    public static void main(String[] args) {

        Scanner input = new java.util.Scanner(System.in);

        System.out.println(numerator(input.nextInt()));

    }
}
