/**
 * Francesca Ramunno
 * December 19 2016
 * 
 * This class implements the algorithm "Mergesort" to sort
 * an unordered array of integers.
 * The complexity of this algorithm is:
 *    - O(n*log(n)
 *
 * The steps to implement Mergesort:
 * 
 *    1) Divide unsorted array into n partitions, each containing
 *       1 integer, where that integer is considered to be sorted.
 *    2) Merge these partitioned integers to make new sub arrays
 *       until there is only one left (this is the sorted array).
 **/

public class MergeSort {
  
  private int[] arrayToSort; // this is the array we will eventually sort
  private int[] tempArray; 
  private int arrayToSortLength; // this holds the length of the array we want to sort
  
  public void sort(int[] inputArray) {
    if (inputArray == null || inputArray.length == 0) { // verify the array is not null or empty
      System.out.println("Input array cannot be null or empty.");
    }
    else {
      arrayToSort = inputArray;
      arrayToSortLength = arrayToSort.length;
      tempArray = new int[arrayToSortLength]; // set the length of the temp array to the length of the array to sort
      
      System.out.println("--------INITIAL ARRAY-------");
      Functions.printArr(arrayToSort);
      mergeSort(0, arrayToSortLength - 1);
    }
  }
  
  public void mergeSort(int min, int max) {
    if (min < max) {
      int middle = (min + (max - min) / 2);
      mergeSort(min, middle); // sort the left side of the array
      mergeSort(middle + 1, max); // sort the right side of the array
      mergeSides(min, middle, max); // merge both sides
    }
  }
  
  public void mergeSides(int min, int middle, int max) {
    for (int i=0; i <= max; i++) {
      tempArray[i] = arrayToSort[i]; // copy the array to sort to the temporary array
    }
    int i = min; // this min will be used to index the temporary array
    int j = middle + 1;
    int k = min; // this min will be used to index the array to sort 
    
    while (i <= middle && j <= max) { // the min is less than or equal to the middle and
                                      // the middle is less than or equal to the max
      if (tempArray[i] <= tempArray[j]) { 
        arrayToSort[k] = tempArray[i];
        i++;
      }
      else {
        arrayToSort[k] = tempArray[j];
        j++;
      }
      k++;
    }
    while (i<= middle) {
      arrayToSort[k] = tempArray[i];
      k++;
      i++;
    }
  }
  
  public static void main(String args[]) {
    MergeSort sorter = new MergeSort();
    int[] inputArray = {10, 5, 6, 2, 1, 30, 26, 66, 78, 12, 10};
    sorter.sort(inputArray);
    System.out.println("---------FINAL ARRAY---------");
    Functions.printArr(inputArray);
  }
}
