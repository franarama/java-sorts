/**
 * Francesca Ramunno
 * December 19 2016
 * 
 * This class will provide static methods
 * that are commonly used in the other sorting
 * classes to increase efficiency.
 * 
 **/

public class Functions {
  public static void printArr(int[] arr) {
    for (int i:arr) {
      System.out.print(i);
      System.out.print(" ");
    }
    System.out.println();
    System.out.println();
  }
  public static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

