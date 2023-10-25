/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (30 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */


import java.util.Scanner;
public class Q2_TwoSum {
    /* place your subroutine code here */
    public static int[] twoSum(int[] nums, int target) {
        int[] dummy;
        dummy = new int[0];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    int[] solution;
                    solution = new int[2];
                    solution[0] = i;
                    solution[1] = j;
                    return(solution);
                }else{


                }
            }
        }
        return(dummy);

    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("What is the size of the array to be inputted");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("Please give the value for the number in position " +(i+1));
            array[i] = input.nextInt();
        }
        System.out.println("Please provide the target number");
        int target = input.nextInt();
        int[] solution = twoSum(array, target);
        System.out.println("Index 1 is " +solution[0]);
        System.out.println("Index 2 is " +solution[1]);


    }

}
