/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }           

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.


        /* place your code here */

        for(int i = initial_phone_number.length()-1; i >= 0; i--){
            if(initial_phone_number.charAt(i) == 'A' || initial_phone_number.charAt(i) == 'B' || initial_phone_number.charAt(i) == 'C'){
                number += 2*Math.pow(10, 9-i);

            }else if(initial_phone_number. charAt(i) == 'D' || initial_phone_number.charAt(i) == 'E' || initial_phone_number.charAt(i) == 'F'){
                number += 3*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'G' || initial_phone_number.charAt(i) == 'H' || initial_phone_number.charAt(i) == 'I'){
                number += 4*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'J' || initial_phone_number.charAt(i) == 'K' || initial_phone_number.charAt(i) == 'L'){
                number += 5*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'M' || initial_phone_number.charAt(i) == 'N' || initial_phone_number.charAt(i) == 'O'){
                number += 6*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'P' || initial_phone_number.charAt(i) == 'Q' || initial_phone_number.charAt(i) == 'R' || initial_phone_number.charAt(i) == 'S'){
                number += 7*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'T' || initial_phone_number.charAt(i) == 'U' || initial_phone_number.charAt(i) == 'V'){
                number += 8*Math.pow(10, 9-i);
            }else if(initial_phone_number. charAt(i) == 'W' || initial_phone_number.charAt(i) == 'X' || initial_phone_number.charAt(i) == 'Y' || initial_phone_number.charAt(i) == 'S'){
                number += 9*Math.pow(10, 9-i);
            }else{
                number += (Character.getNumericValue(initial_phone_number.charAt(i)))*Math.pow(10, 9-i);
            }        
        }


        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
