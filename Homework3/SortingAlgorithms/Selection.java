package SortingAlgorithms; 

public class Selection { 
  public static int counter;

  public static int[] ascending(int a[]) {
    counter = 0;
    int n = a.length;
    for (int i = 0; i < n-1; i++) {
      int q = i; 
      counter++; 
      for (int j = i+1; j < n; j++) {
        if (a[j] < a[q]) {
          q = j; 
          counter++;
        } 
      }
    int temp = a[i]; 
    a[i] = a[q]; 
    counter++;
    a[q] = temp;  
    counter++;
    } 
   return a; 
 } 
  
  public static int[] descending(int a[]) {
	    counter = 0;
      int n = a.length;
	    for (int i = 0; i < n-1; i++) {
	      int q = i; 
        counter++; 
	      for (int j = i+1; j < n; j++) {
	        if (a[j] > a[q]) {
	          q = j; 
            counter++;
	        } 
	      }
	    int temp = a[i]; 
	    a[i] = a[q];
      counter++; 
	    a[q] = temp; 
      counter++; 
	    } 
	   return a; 
	 } 
  
} 