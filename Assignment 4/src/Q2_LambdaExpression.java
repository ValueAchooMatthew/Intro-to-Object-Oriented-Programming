/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    /* place your subroutine code here */

    public static double functionOne(double x, double y){

        return(Math.sqrt(x*x-y*y));

    }
    public interface FunctionInterface{
        double operate(double x, double y);

    }
    static FunctionInterface functionTwo = (x, y) -> {return Math.sqrt(x*x-y*y);};


    public static void main(String[] args){
        /* place your code to run your subroutine here */
        Scanner input = new java.util.Scanner(System.in);
        double value_one = input.nextDouble();
        double value_two = input.nextDouble();
        if((value_one*value_one - value_two*value_two) >= 0){
            System.out.printf("%.4f", functionOne(value_one, value_two));
            System.out.println("");
            System.out.printf("%.4f", functionTwo.operate(value_one, value_two));

        }else{
            throw new ArithmeticException("Make sure your first value squared minus the second value squared is grater than or equal to zero");
        }




    }
}
