/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
public class Q5_Roman2Integer {
    /* place your subroutine code here */

    public static int romanToNumeral(String roman){
        int numeral = 0;

        for(int i = 0; i < roman.length(); i++){
            if(i <= roman.length() - 2){
                if(roman.charAt(i) == 'I'){
                    if(roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X'){
                        numeral -= 1;
                    }else{
                        numeral += 1;
                    }
                }else if(roman.charAt(i) == 'X') {
                    if(roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C'){
                        numeral -= 10;
                    }else{
                        numeral += 10;
                    }
                }else if(roman.charAt(i) == 'C') {
                    if(roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M'){
                        numeral -= 100;
                    }else{
                        numeral += 100;
                    }
                }else if(roman.charAt(i) == 'V') {
                    numeral += 5;
                }else if(roman.charAt(i) == 'L') {
                    numeral += 50;
                }else if(roman.charAt(i) == 'D') {
                    numeral += 500;
                }else{
                    numeral += 1000;
                }
            }else{
                if(roman.charAt(i) == 'I'){
                    numeral += 1;
                }else if(roman.charAt(i) == 'V'){
                    numeral += 5;
                }else if(roman.charAt(i) == 'X'){
                    numeral += 10;
                }else if(roman.charAt(i) == 'L'){
                    numeral += 50;
                }else if(roman.charAt(i) == 'C'){
                    numeral += 100;
                }else if(roman.charAt(i) == 'D'){
                    numeral += 500;
                }else{
                    numeral += 1000;
                }
            }
        }
        return numeral;
    }


    public static void main(String[] args){
        /* place your code to run your subroutine here */
        System.out.println("Please enter the roman numerals to be converted:");
        Scanner input = new java.util.Scanner(System.in);
        String roman = input.nextLine();
        System.out.println(romanToNumeral(roman));


    }
}
