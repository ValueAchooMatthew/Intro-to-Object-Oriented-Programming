/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a java program to use Method Overloading for printing three types of array:
 * Integer[], Character[] and Double[].
 *
 * Input: None.
 * Output: print out different types of array.
 *
 * There is no specific format as long as printed arrays are neatly and cleanly.
 *
 */
public class Q4_PrintArray {
    // creating a method for printing integer array
    static class Printer{
        public void array_print(Integer[] array){
            System.out.println("Printing integer array");
            for(int i = 0; i< array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
        /* place your code here */

        // overloading the above created method with different parameter method
        // contains a character parameter
        /* place your code here */
        public void array_print(Character[] array){
            System.out.println("\nPrinting character array");
            for(int i = 0; i< array.length; i++){
                System.out.print(array[i] + " ");
            }

        }
        // overloading the above created method with different parameter method
        // contains a double parameter
        /* place your code here */
        public void array_print(Double[] array){
            System.out.println("\nPrinting double array");
            for(int i = 0; i< array.length; i++){
                System.out.print(array[i] + " ");
            }

        }
    }
    public static void main(String[] args) {
        Integer[] iarr = {1,2,3,4,5};
        Character[] carr = {'A','B','C','D','E'};
        Double[] darr = {1.234, 2.345, 3.456, 4.567};

        // calling the methods and printing the arrays
        /* place your code here */
        Printer prt = new Printer();
        prt.array_print(iarr);
        prt.array_print(carr);
        prt.array_print(darr);

    }
}
