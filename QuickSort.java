/**
 * This class implements the algorithm "Quicksort" to sort
 * an unordered array of integers.
 * The complexity of this algorithm is:
 *    - average case: O(n log(n))
 *    - worst case:O(n^2)
 *
 * The steps to implement Quicksort:
 * 
 *    1) Choose an integer to be the 'pivot' (generally an
 *       integer that is either in the middle or close to the
 *       middle index of the array).
 *    2) Reorder the list so that all integers with values
 *       less than that of the pivot come before the pivot,
 *       while all integers with values greater than that
 *       of the pivot come after. (Equal values can go either
 *       way).This is called the 'partition operation'.
 *    3) Apply steps 1) and 2) recursively to the sub-array of
 *       integers with smaller values and also the sub-array of
 *       integers with greater values.
 **/

public class QuickSort {
    
    private int[] arrToSort; //this is the array we will eventually sort
    private int arrToSortLength; //this holds the length of the array
    
    public void sort(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) { //verify the input array is not null or empty
            System.out.println("The input array cannot be null or empty.");
        }
        else {
            arrToSort = inputArray; 
            arrToSortLength = inputArray.length;
            quickSort(0, arrToSortLength-1);
        }
    }
    
    public void quickSort(int min, int max) {
        int i = min;
        int j = max;
        
        int pivot = arrToSort[min + (max - min) / 2]; //set the pivot to the ~ middle value of the array
        
        /**** Series of print statements to help understand how the algorithm works ****/
        
        System.out.println();
        System.out.println("PIVOT: " + pivot);
        System.out.print("ARRAY: ");
        
        Functions.printArr(arrToSort);
        
        /**************************** End of print statements *************************/
        
        while (i <= j) { //divide the array into two sub-arrays: i operates on the left side of the pivot while j operates
                         //on the right side
            while(arrToSort[i] < pivot) { // while the value of arrToSort[i] is less than the value of the pivot, increment i by 1
                                          // until a greater value on the left side is found. (i is the index of this value)
                i++; 
            }
            while(arrToSort[j] > pivot) { // while the value of arrTOSort[j] is greater than the value of the pivot, decrement j by 1
                                          // until a lesser value on the right side is found. (j is the index of this value).
                j--;
            }
            if (i<= j) { // if a large value is found on the left and a small value found on the right, switch them and continue the search.
                System.out.println("SWITCH: " + arrToSort[i] + " AND " + arrToSort[j]);
                Functions.swap(i,j,arrToSort);
                i++;
                j--;
            }
        }
        System.out.println("------------------------------");
        
        // this is where the recursion happens!
        if (min < j) {
            quickSort(min, j);
        }
        if (i < max) {
            quickSort(i,max);
        }
    }
    
    public static void main(String arr[]) {
      
        QuickSort sorter = new QuickSort();
        int[] inputArray = {3,19,12,1,10,1,7,6,25,18};
        
        System.out.println("INITAL ARRAY");
        Functions.printArr(inputArray);
        
        System.out.println("------------------------------");
        sorter.sort(inputArray);

        System.out.println();
        System.out.println("FINAL ARRAY");
        Functions.printArr(inputArray);
    }
}



