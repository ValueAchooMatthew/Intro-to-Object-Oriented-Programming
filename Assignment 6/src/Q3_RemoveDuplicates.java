/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Q3_RemoveDuplicates {
    /* place your subroutine code here */
    static ArrayList<Integer> sorter(ArrayList<Integer> list){
        boolean done = false;
        while(!done){
            done = true;
            for(int i = 0; i < list.size()-1; i++){
                if (list.get(i) < list.get(i+1)){
                    int temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    done = false;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new java.util.Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("How many elements will be in the Array List?");
        int size = input.nextInt();
        for(int i = 0; i < size; i++){
            System.out.println("Please input the value at position " +(i+1));
            int number = input.nextInt();
            if(list.contains(number)){
                continue;
            }else{
                list.add(number);
            }
        }
        System.out.println(sorter(list));


    }
}
