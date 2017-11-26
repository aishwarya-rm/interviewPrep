import java.util.*;
class mergeSort{
  public static void main(String[] args){

  }
  public static int[] mergeSort(int[] arr){
    return mergeSortHelper(arr, 0, arr.length - 1);
  }
  public static int[] mergeSortHelper(int[] arr, int low, int high){
      if(low >= high){
        return arr[low];
      }
      int mid = (low + high) / 2;
      int[] left = Arrays.copyOfRange(arr, low, mid);
      int[] right = Arrays.copyOfRange(arr, mid, high);
  }
  public static int[] merge(int[] arr, int[] arr2){

  }

}
