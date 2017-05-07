//Score: 95
//Good work!
//-5 for incorrect output on bubble descending

import SortingAlgorithms.*;
import HelperClasses.*;

public class SortingTest {

  private enum SortDirection {
    ASCENDING,
    DESCENDING
  }

  public static void main(String[] args) {

  	ArrayGeneration generator = new ArrayGeneration();
  	SortingTest tester = new SortingTest();


  	// System.out.println(tester.isSorted(testArrayDescending, SortingTest.SortDirection.ASCENDING));
  	// testArrayDescending = Bubble.ascending(testArrayDescending);
  	// System.out.println(tester.isSorted(testArrayDescending, SortingTest.SortDirection.ASCENDING));
  	// System.out.println(Bubble.counter);


  	//generate 10 arrays of 10
  	int[][] arrayOfArrays10 = new int[10][10];
  	for (int i = 0; i < 10; i++){
  		arrayOfArrays10[i] = generator.generateArray(10);
  	}


  	// for(int i = 0; i < 10; i++){
 		// for(int j = 0; j < 10; j++){
  	// 		System.out.print(arrayOfArrays10[i][j]);
  	// 	}
  	// }


  	//generate 10 array of 100
  	int[][] arrayOfArrays100 = new int[10][100];
  	for (int i = 0; i < 10; i++){
  		arrayOfArrays10[i] = generator.generateArray(100);
  	}

  	//generator 10 arrays of 1000
  	int[][] arrayOfArrays1000 = new int[10][1000];
  	for (int i = 0; i < 10; i++){
  		arrayOfArrays10[i] = generator.generateArray(1000);
  	}

  	//take first sort algorith
  	int[] countValues10 = new int[10];
  	int[] toBeSorted10 = new int[10]; //workaround to access the specific array in the array of arrays that we need.
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10[j] = arrayOfArrays10[i][j];
  		}
  		Bubble.ascending(toBeSorted10);
  		int addToArray = Bubble.counter;
  		countValues10[i] = addToArray;
  	}


  	int[] countValues100 = new int[10];
  	int[] toBeSorted100 = new int[100];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 100; j++){
  			toBeSorted100[j] = arrayOfArrays10[i][j];
  		}
  		Bubble.ascending(toBeSorted100);
  		countValues100[i] = Bubble.counter;
  	}

  	int[] countValues1000 = new int[10];
  	int[] toBeSorted1000 = new int[1000];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 1000; j++){
  			toBeSorted1000[j] = arrayOfArrays10[i][j];
  		}
  		Bubble.ascending(toBeSorted1000);
  		countValues1000[i] = Bubble.counter;
  	}

  	//print the averages
  	System.out.println("BubAsc: " + averageCounts(countValues10));
  	System.out.println("BubAsc: "+ averageCounts(countValues100));
  	System.out.println("BubAsc: "+ averageCounts(countValues1000));


  	//take second sort algorith
	int[] countValues10BD = new int[10];
  	int[] toBeSorted10BD = new int[10]; //workaround
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10BD[j] = arrayOfArrays10[i][j];
  		}
  		Bubble.descending(toBeSorted10BD);
  		int addToArray = Bubble.counter;
  		countValues10BD[i] = addToArray;
  	}


  	int[] countValues100BD = new int[10];
    int[] toBeSorted100BD = new int[100]; //workaround
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 100; j++){
        toBeSorted100BD[j] = arrayOfArrays100[i][j];
      }
      Bubble.descending(toBeSorted100BD);
      int addToArray = Bubble.counter;
      countValues100BD[i] = addToArray;
    }

  	int[] countValues1000BD= new int[10];
    int[] toBeSorted1000BD= new int[1000];
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 1000; j++){
        toBeSorted1000BD[j] = arrayOfArrays1000[i][j];
      }
      Bubble.descending(toBeSorted1000BD);
      countValues1000BD[i] = Bubble.counter;
    }

  	//print the averages
  	System.out.println("BubDesc: "+ averageCounts(countValues10BD));
  	System.out.println("BubDesc: "+ averageCounts(countValues100BD));
  	System.out.println("BubDesc: "+ averageCounts(countValues1000BD));


	int[] countValues10SA= new int[10];
  	int[] toBeSorted10SA= new int[10]; //workaround
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10SA[j] = arrayOfArrays10[i][j];
  		}
  		Selection.ascending(toBeSorted10SA);
  		int addToArray = Selection.counter;
  		countValues10SA[i] = addToArray;
  	}


  	int[] countValues100SA= new int[10];
  	int[] toBeSorted100SA= new int[100];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 100; j++){
  			toBeSorted100SA[j] = arrayOfArrays100[i][j];
  		}
  		Selection.ascending(toBeSorted100SA);
  		countValues100SA[i] = Selection.counter;
  	}

  	int[] countValues1000SA= new int[10];
  	int[] toBeSorted1000SA= new int[1000];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 1000; j++){
  			toBeSorted1000SA[j] = arrayOfArrays1000[i][j];
  		}
  		Selection.ascending(toBeSorted1000SA);
  		countValues1000SA[i] = Selection.counter;
  	}

  	//print the averages
  	System.out.println("SelAsc: "+ averageCounts(countValues10SA));
  	System.out.println("SelAsc: "+ averageCounts(countValues100SA));
  	System.out.println("SelAsc: "+ averageCounts(countValues1000SA));


//next sorting algorith
  	int[] countValues10SD = new int[10];
  	int[] toBeSorted10SD= new int[10]; //workaround
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10SD[j] = arrayOfArrays10[i][j];
  		}
  		Selection.descending(toBeSorted10SD);
  		int addToArray = Selection.counter;
  		countValues10SD[i] = addToArray;
  	}


  	int[] countValues100SD= new int[10];
  	int[] toBeSorted100SD= new int[100];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 100; j++){
  			toBeSorted100SD[j] = arrayOfArrays100[i][j];
  		}
  		Selection.descending(toBeSorted100SD);
  		countValues100SD[i] = Selection.counter;
  	}

  	int[] countValues1000SD= new int[10];
  	int[] toBeSorted1000SD= new int[1000];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 1000; j++){
  			toBeSorted1000SD[j] = arrayOfArrays1000[i][j];
  		}
  		Selection.descending(toBeSorted1000SD);
  		countValues1000SD[i] = Selection.counter;
  	}

  	//print the averages
  	System.out.println("SelDesc: "+ averageCounts(countValues10SD));
  	System.out.println("SelDesc: "+ averageCounts(countValues100SD));
  	System.out.println("SelDesc: "+ averageCounts(countValues1000SD));


//now onto the insertion algorith
	int[] countValues10IA= new int[10];
  	int[] toBeSorted10IA= new int[10]; //workaround
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10IA[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.ascending(toBeSorted10IA);
  		int addToArray = Insertion.counter;
  		countValues10IA[i] = addToArray;
  	}


  	int[] countValues100IA= new int[10];
  	int[] toBeSorted100IA= new int[100];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 100; j++){
  			toBeSorted100IA[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.ascending(toBeSorted100IA);
  		countValues100IA[i] = Insertion.counter;
  	}

  	int[] countValues1000IA= new int[10];
  	int[] toBeSorted1000IA= new int[1000];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 1000; j++){
  			toBeSorted1000IA[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.ascending(toBeSorted1000IA);
  		countValues1000IA[i] =Insertion.counter;
  	}

  	//print the averages
  	System.out.println("InsAsc: "+ averageCounts(countValues10IA));
  	System.out.println("InsAsc: "+ averageCounts(countValues100IA));
  	System.out.println("InsAsc: "+ averageCounts(countValues1000IA));


//LAST ONE!
  	int[] countValues10ID = new int[10];
  	int[] toBeSorted10ID= new int[10]; //workaround
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 10; j++){
  			toBeSorted10ID[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.descending(toBeSorted10ID);
  		int addToArray = Insertion.counter;
  		countValues10ID[i] = addToArray;
  	}


  	int[] countValues100ID= new int[10];
  	int[] toBeSorted100ID= new int[100];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 100; j++){
  			toBeSorted100ID[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.descending(toBeSorted100ID);
  		countValues100ID[i] = Insertion.counter;
  	}

  	int[] countValues1000ID= new int[10];
  	int[] toBeSorted1000ID= new int[1000];
  	for(int i = 0; i < 10; i++){
  		for(int j = 0; j < 1000; j++){
  			toBeSorted1000ID[j] = arrayOfArrays10[i][j];
  		}
  		Insertion.descending(toBeSorted1000ID);
  		countValues1000ID[i] = Insertion.counter;
  	}

  	//print the averages
  	System.out.println("InsDesc: "+ averageCounts(countValues10ID));
  	System.out.println("InsDesc: "+ averageCounts(countValues100ID));
  	System.out.println("InsDesc: "+ averageCounts(countValues1000ID));
}


  private static int averageCounts(int[] arrayToAverage){
  	int sum = 0;
  	for (int i=0; i <10; i++){
  		sum = sum + arrayToAverage[i];
  	}
  	return sum/10;
  }

  private boolean isSorted(int[] data, SortDirection direction) { //this is the original code for testing if something is sorted

  if (direction == SortingTest.SortDirection.ASCENDING) {
    int n = data.length;

			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (data[j - 1] > data[j]) {
						return false;
					}
				}
			}

		}
		if (direction == SortingTest.SortDirection.DESCENDING) {
			int n = data.length;

			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (data[j - 1] < data[j]) {
						return false;
					}
				}
			}
		}
		return true;

	}
 }
