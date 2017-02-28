/**
 * Homework 1 for CSC-281.001 Spring 2017
 * 
 * Your codename: Chalirena
 * 
 * This assignment consists of 7 problems. Problem 1 asks you to modify existing
 * code for three subproblems.The remaining six problems each require you to 
 * write a method that satisfies the requirements stated in their descriptions.
 * 
 * You are required to create a javadoc style comment for each method you
 * create. See the sample method named add3 for an example to follow. 
 * 
 * Your homework will be graded in the following manner:
 * 70 points for correctness.
 * 		10 points per problem.
 * 		Does your input match the expected output exactly?
 * 30 points for following standards. Evaluation considerations for these points:
 *		Did you use vi to craft your code?
 *		Are camel case and Pascal case used correctly?
 * 		Did you follow the the submission instructions properly?
 */

import java.math.*; // math has been imported for you
import java.util.*;

public class Homework1 {

  /**
   * The entry point for the program.
   */

  public static void main(String[] args) {
    Homework1 hw1 = new Homework1();

    System.out.println("===Problem 1===");
    hw1.problem1();

    System.out.println("===Problem 2===");
    System.out.println(hw1.topInt(1.5));
    System.out.println(hw1.topInt(5.1));
    System.out.println(hw1.topInt(1.0));
    System.out.println(hw1.topInt(-4.2));


    System.out.println("===Problem 3===");
    hw1.draw4x4('-');
    hw1.draw4x4('4');

    System.out.println("===Problem 4===");
    System.out.println(hw1.citationName("Alastair", "Reynolds"));
    System.out.println(hw1.citationName("Grace", "Hopper"));

    System.out.println("===Problem 5===");
   System.out.println(String.valueOf(hw1.min3(1.0, 2.0, 3.0)));
   System.out.println(String.valueOf(hw1.min3(4.0, 3.0, 2.0)));
   System.out.println(String.valueOf(hw1.min3(0.5, 0.1, 0.5)));
    
    System.out.println("===Problem 6===");
    System.out.println(hw1.fibonacci(0));
    System.out.println(hw1.fibonacci(1));
    System.out.println(hw1.fibonacci(2));
    System.out.println(hw1.fibonacci(3));
    System.out.println(hw1.fibonacci(10));
    System.out.println(hw1.fibonacci(25));
    
    
    System.out.println("===Problem 7===");
    //System.out.println(hw1.isPalindrome("racecar"));
    //System.out.println(hw1.isPalindrome("cat"));
    //System.out.println(hw1.isPalindrome("hannah"));
    //System.out.println(hw1.isPalindrome("saippuakivikauppias"));
  }

 // PROBLEM 1

public void problem1() {
 double result1 = (5.0 /4.0); 
  if (1.25 == result1) {
      System.out.println("Problem 1a: successfully completed!");
    } else {
      System.out.println("Problem 1a: not quite right.");
    }

    double result2 = Math.pow(4.0, 2.0); //this is how to exponentiate in java using the math package
    if (result2 == 16) {
      System.out.println("Problem 1b: successfully completed!");
    } else {
      System.out.println("Problem 1b: not quite right.");
    }

    String strA = new String("foo");
    String strB = new String("foo");
    if (strA.equals(strB)) {
      System.out.println("Problem 1c: successfully completed!");
    } else {
      System.out.println("Problem 1c: not quite right.");
    }
  }

  /*
   * PROBLEM 2
   *
   * In Java, when a double or float is cast into an integer via (int), the fractional part of the number
   * after that decimal place is thrown away (e.g. 3.3 becomes 3). An example: int x = (int)3.3;
   * 
   * @param tenths, a double which is intended to be rounded 
   * this method returns the double rounded up instead of being rounded down.
   */

public double topInt(double tenths) {
  double rounded = Math.floor(tenths)+1.0;

 return rounded;
}

  /*
   * PROBLEM 3
   * 
   * This will be a method named "draw4x4" that prints a 4 by 4 box of a character. 
   * @param design, the character to draw the box with. 
    */

public void draw4x4 (char design){
  System.out.println(""+design+design+design+design);
  System.out.println(design+"  "+design);
  System.out.println(design+"  "+design);
  System.out.println(""+design+design+design+design);
} 

  /*
   * PROBLEM 4
   * 
   * @param firstName, a first name 
   * @param lastName, a last name. 
   *
   * It should return a string that contains the last name concatenated with a comma, a
   * space, the first letter of the first name, and a period.
   *
   * For example: citationName("Jack", "Beatty") should return: "Beatty, J."
   *
   */

public String citationName(String firstName, String lastName) {
 return (lastName + ", " + firstName.charAt(0)+"."); //this will just take use the first character of the string, ie, giving us the A in Apple
}  

  /*
   * PROBLEM 5
   * 
   * @param num1--the first double
   * @param num2--the second double
   * @param num3--the third double
   * 
   * this method returns the lowest value of the three
   */

public double min3(double num1, double num2, double num3) {
 double getComparing;

 if (num1>num2) {
    getComparing=num1;
  } else {
     getComparing=num2;
}

if (num3>getComparing) {
 return (num3);
  } else {
      return (getComparing);
  }
}

 /*
   * PROBLEM 6
   * 
   * @param n--n is the number of iterations
   * 
   *
   * This method assumes the seed values of F(0) = 1 and F(1) = 1, and utilizes recursion, 
   *meaning the method calls itself.
   */
 
public int fibonacci (int n) {
  if (n==0) 
   {return 0;
} else if (n==1) {
    return 1;
} else {
    return fibonacci(n-1) + fibonacci(n-2); }
}

 /* PROMBLEM 7
   * NOTE: UNSURE WHY THIS DOES NOT COMPILE. THERE IS AN ISSUE WITH THE CREATION OF THE ARRAYLIST
   * A palindrome is where a word or sentence is spelled the same
   * forward as it is backward. For example, "pop" is a palindrome where "cat" is not. The sentence
   * "Was it a car or a cat I saw" is a palindrome when the spaces are extracted and it is converted
   * to all lowercase letters. 
   *
   *Fun Fact: The longest known single word palindrome " saippuakivikauppias", the finnish word for a type of lye.
   *
   * This is a method named "isPalindrome" that takes a single String parameter.
   * Note: This method will only run correctly on lowercase strings.
   * It should return the boolean value of true if the string is a palindrome or false if it is not.
   * 
   */

 /* public void isPalindrome(String thing) {
  * List<char> list1=new ArrayList<char>();
  * List<char> list2=new ArrayList<char>();
  * for(int i=0; thing.length(); i++) { //this part will convert the string into an Array List of characters
  * char letter=thing.charAt(i); 
  * list1.add (letter);
  * }
  *
  * for(int i=list1.size - 1; list1.size; i--) { //this put the characters from list1 into list2 in reverse order
  * char backletter=thing.charAt(i); 
  *  list2.add (backletter);
  * }
  * 
  * if (list1.equals(list2)) {
  * System.out.printline("This is a palindrome");
  * } else {
  *  System.out.printline("No fun--This is not a palindrome.");
  * }
  * }
  */
}
