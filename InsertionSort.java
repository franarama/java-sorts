/**
 * Francesca Ramunno
 * December 19 2016
 * 
 * This class implements the algorithm "Insertion Sort" to sort
 * an unordered array of integers.
 * The complexity of this algorithm is:
 *    - Best case: O(n)
 *    - Average: O(n^2)
 *
 * This sort is very efficient for small data sets.
 * 
 * The steps to implement Insertion Sort:
 * 
 *    1) Iterate through the array, remove one integer per iteration and
 *       find the location it belongs and insert it there.
 *    2) Continue until no integers remain and there is a sorted
 *       output array.
 **/

public class InsertionSort {
  public static int[] insertionSort(int[] inputArray) {
    for (int i = 1; i < inputArray.length; i++) {
      for (int j = i; j > 0; j--) {
        if (inputArray[j] < inputArray[j - 1]) { // compare inputArray[j] to the value before, if it is smaller
          Functions.swap(j, (j - 1), inputArray); // then swap them.
        }
      }
      System.out.println("ITERATION i = " + i);
      Functions.printArr(inputArray);
    }
    return inputArray;
  }
  public static void main(String args[]) {
    int[] inputArray = {3, 1, 2, 1, 8, 2, 10, 15, 12, 4};
    System.out.println("-----INITIAL ARRAY------");
    Functions.printArr(inputArray);
    
    int[] outputArray = insertionSort(inputArray);
    System.out.println("------FINAL ARRAY-------");
    Functions.printArr(outputArray);
  }
}
