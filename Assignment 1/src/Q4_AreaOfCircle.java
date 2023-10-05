/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;

public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		/* Place your code here */
		Scanner input = new java.util.Scanner(System.in);
		double radius = input.nextFloat();
		double circumference = radius*2*Math.PI;
		double area = radius*radius*Math.PI;
		System.out.printf("%.2f", circumference);
		System.out.println("");
		System.out.printf("%.2f", area);
	}
}
