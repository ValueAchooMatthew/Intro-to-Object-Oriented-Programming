/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    /* place your subroutine code here */
    static String quadraticEquation(double a, double b, double c){

//        Check if discriminant is >0
        if((b*b- 4*a*c) < 0){
            String output = "The equation has no real roots" ;
            return output;
        }else{
            double x1 = ((-b + Math.sqrt(b*b - 4*a*c))/2*a);
            double x2 = ((-b - Math.sqrt(b*b - 4*a*c))/2*a);

            String output = String.format("The two roots are: %.2f and %.2f",  x1, x2);
            return output;


        }

    }


    public static void main(String[] Strings) {
        Scanner input = new java.util.Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        System.out.print(quadraticEquation(a, b, c));
    ;
    }
}
