/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a Java program to convert a decimal number to octal number.

    Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.
    Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 * INPUT: a user input decimal number x
 * OUTPUT: an octal number y converted from x

* Hint: For a decimal number x=1256, the corresponding octal number is y=2350.
 */

import java.util.Scanner;

public class Q2_Decimal2Octal {
    public static void main(String args[])
    {
        /* place your code here */
        Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        String converted = "";
        Boolean done = false;

//        Checks except for final digit
        while(number >= 8){
            int remainder = number % 8;
            number = number/8;
            converted = remainder + converted;

        }
        int remainder = number % 8;
        number = number/8;
        converted = remainder + converted;


        System.out.println(converted);



    }
}
