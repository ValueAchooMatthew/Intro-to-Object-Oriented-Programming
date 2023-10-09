/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Define a class "People", there are three parameters: "String name", "int age" and
 * "String gender", you can define them with keywords "public" and "private", so that
 * users can access "name" anywhere in class, but will have a compile-time error message
 * if they want to access "gender" and "age".
 *
 * Write a method getName() in class People, and call it in "main" to print member1 and
 * member2' names.
 *
 * Input: None
 * Output: all members' names.
 *
 */

class People{
    public String name;
    private String gender;
    private int age;
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    void getName(){
        System.out.println(name);
    }
}
public class Q3_People {

    //you can modify class People to finish the question
    /* place your code here */



    public static void main(String[] args) {
        // define two members with following information
        // name:"Jack", age:19, gender:"Male";
        // name:"Rose", age:18, gender:"Female"

        /* place your code here */
        People Jack = new People();
        People Rose = new People();
        Jack.name = "Jack";
        Jack.setAge(19);
        Jack.setGender("Male");
        Jack.getName();

        Rose.name = "Rose";
        Rose.setAge(18);
        Rose.setGender("Female");
        Rose.getName();



    }

}
