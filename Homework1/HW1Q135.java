import java.math.*; //this will import java's math package, allowing us to access those functions.
//Problem 1: practice with Booleans
public void problem1(){
	double result1=(5.0/4.0);
	if (1.25==result1){
		system.out.println("problem 1a: successfully completed!");
	} else {
		system.out.println("Problem 1a: not quite right....");
	}
	int result2=(4*2)
		if (result2 !=16) {
			system.out.println("problem 1b: successfully completed!");
		} else {
			system.out.println("problem 1b: still not quite right...");
		}
	
	String strA=new String("foo");
	String strB=new String("foo");
	if (equals (strA, strB)) {
		system.out.println("problem 1c: All done--successfully completed!");
	} else {
		system.out.println("problem 1c: So close, but not quite right.");
	}
/*
   * PROBLEM 2
   *
   * When a double or float is cast into an integer via (int), the fractional part of the number
   * after that decimal place is thrown away (e.g. 3.3 becomes 3). An example: int x = (int)3.3;
   * 
   *This method will round to the next highest integer.
   */

public void topInt(double x)
 public double tenths=x;
 public int rounded = floor(double tenths) + 1;

 system.out.println(rounded);

 /*
  * Problem 5
  *
  * This will provide the lowest of the three inputs
  */

 public void min3(double x, double y, double z)
 public double num1=x;
 public double num2=y;
 public double num3=z;
 	
 if (num1>num2) {
	public double getComparing = num1
 } else {
	 public double getComparing = num2
 }

if (num3>getComparing) {
	system.out.println(num3);
} else {
	system.out.println(getComparing);
}

