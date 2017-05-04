package SortingAlgorithms;

public class Bubble{

  public static int counter;
	
  public static int[] descending(int[] intArray) {
    int n = intArray.length;
    int temp = 0;
    counter = 0;
               
    for(int i=0; i < n; i++){
      for(int j=1; j < (n-i); j++){
        if(intArray[j-1] < intArray[j]){
          temp = intArray[j-1];
          counter++;
          intArray[j-1] = intArray[j];
          counter++;
          intArray[j] = temp;
          counter++;
        }                      
      }
    }
    return intArray;
  }

  public static int[] ascending(int[] intArray) {
	  int n = intArray.length;
	  int temp = 0;
    counter = 0;
	              
	  for(int i=0; i < n; i++){
	      for(int j=1; j < (n-i); j++){
	        if(intArray[j-1] > intArray[j]){
	          temp = intArray[j];
            counter = counter +1;
	          intArray[j] = intArray[j - 1];
            counter= counter + 1;
	          intArray[j - 1] = temp;
            counter = counter +1;
	        }                      
	      }
	    }
	  return intArray;
  }

}