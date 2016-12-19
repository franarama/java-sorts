/**
 * Francesca Ramunno
 * December 19 2016
 * 
 * This class implements the algorithm "Selection Sort" to sort
 * an unordered array of integers.
 * The complexity of this algorithm is:
 *    - O(n^2)
 *
 * The steps to implement Selection Sort:
 * 
 *    1) Scan the array for the lowest integer and compare it to the 
 *       value at the beginning of the array, and if it is smaller, swap
 *       the values. 
 *    2) Redo step 1) starting after the already sorted portion of the array
 *       until reaching the end of the array.
 **/

public class SelectionSort {
  
  public static int[] selectionSort(int[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      int index = i; // begin at the start of the array using it as the default lowest value
                     // (we will compare other values to this one)
      for (int j = i + 1; j < inputArray.length; j++) { // scan after the first value
        if (inputArray[j] < inputArray[index]) { // and if its smaller,
          index = j; // set the index to the index of the smallest value (j)
        }
      }
      // swap the values
      Functions.swap(index, i, inputArray);
      
      System.out.println("--AFTER ITERATION " + i + "---");
      Functions.printArr(inputArray);
    }
  return inputArray;
 }

public static void main(String args[]) {
  int[] inputArray = {12,42,46,7,2,10,60,2,1};
  
  System.out.println("-----INITIAL ARRAY-----");
  Functions.printArr(inputArray);
  
  int[] outputArray = selectionSort(inputArray);
  
  System.out.println("------FINAL ARRAY------");
  Functions.printArr(outputArray);
}
}
