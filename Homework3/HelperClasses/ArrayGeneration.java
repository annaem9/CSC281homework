package HelperClasses;

import java.util.Random;
//start with generating the random arrays


//so we want a class that when given an argument for the size of the array, it makes an array that big, and fills it with random numbers

public class ArrayGeneration {

	public ArrayGeneration(int size){
		Random rand = new Random();
		int[] testArray = new int[size];
		
		for (int i = 0; i < size; i++){
			int x = rand.nextInt(size)+1;
			testArray[i] = x;
		}
		
		/*
		for (int i = 0; i < size; i++){
			System.out.print(testArray[i]);
		}
		*/	
	}
}