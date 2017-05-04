package HelperClasses;

import java.util.Random;
//start with generating the random arrays

public class ArrayGeneration {

	public int[] generateArray(int size){
		Random rand = new Random();
		int[] testArray = new int[size];
		
		for (int i = 0; i < size; i++){
			int x = rand.nextInt(size)+1;
			testArray[i] = x;
		}
		return testArray;
	}
}