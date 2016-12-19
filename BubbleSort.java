/**
 * Francesca Ramunno
 * December 19 2016
 * 
 * This class implements the algorithm "Bubble Sort" to sort
 * an unordered array of integers.
 * The complexity of this algorithm is:
 *    - Average: O(n^2)
 *    - Best case: O(n) (for already sorted lists)
 *
 * Note: this is an inefficient sorting method for large n values.
 * 
 * The steps to implement Bubble Sort:
 * 
 *    1) Scan through the array and compare adjacent integer values
 *       and swap them so they are in correct order.
 *    2) Scan through the array until no more swaps are made and the
 *       array is in turn sorted.
 **/

public class BubbleSort {
  
  public static int[] bubbleSort(int[] inputArray) {
    int length = inputArray.length;
    int j;
    for (int l = length; l >= 0; l--) {
      for (int i = 0; i < length - 1; i++) {
        j = i + 1; 
        if (inputArray[i] > inputArray[j]) { // if the left value is greater than the right value,
          Functions.swap(i, j, inputArray);  // then swap them.
        }
      }
      System.out.println("ITERATION l = " + l); 
      Functions.printArr(inputArray);
    }
    return inputArray;
  }
  
  public static void main(String args[]) {
    int[] inputArray = {3,1,6,9,21,24,12,4,3};
    
    System.out.println("-----INITIAL ARRAY-----"); 
    Functions.printArr(inputArray);
    
    int[] outputArray = bubbleSort(inputArray);
    
    System.out.println("-----FINAL ARRAY-----");
    Functions.printArr(outputArray);
  }
}
