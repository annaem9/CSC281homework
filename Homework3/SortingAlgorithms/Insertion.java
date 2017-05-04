package SortingAlgorithms;

public class Insertion{
  
public static int counter;

  public static int[] descending(int[] array){
    int itemsSorted;
    int currentNum;
    int i; 
    counter = 0 ;

    for (itemsSorted = 1; itemsSorted < array.length; itemsSorted++){  //iterate through array
      currentNum = array[itemsSorted]; //sets the number we are sorting with next index
      for(i = itemsSorted - 1; (i >= 0) && (array[i] < currentNum); i--){
        array[ i+1 ] = array[i];
        counter++;
      }
    array[ i+1 ] = currentNum;
    }
 
    return array;
  }

public static int[] ascending(int[] array){
  int i, j, newValue;
  counter = 0 ;
  for (i = 1; i < array.length; i++) {
    newValue = array[i];
    counter++;
    j = i;
    counter++;
    while (j > 0 && array[j - 1] > newValue) {
      array[j] = array[j - 1];
      counter++;
      j--;
      counter++;
    }
    array[j] = newValue;
  }
  return array;

}
}