import java.util.*;
class mergeSort{
  public static void main(String[] args){
    int[] ret = new int[]{1, 4, 3, 2, 5};
    mergeSort(ret, 0, ret.length - 1);
    for(int i = 0; i < ret.length; i++){
      System.out.print(i);
    }
    System.out.println(" ");
  }
  public static void mergeSort(int[] arr, int low, int high){
      //it's already sorted
      if(arr.length > 1){
        int mid = (low + high) / 2;
        int[] left = Arrays.copyOfRange(arr, low, mid);
        mergeSort(left, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, high);
        mergeSort(right, mid, high);
        merge(left, right);
      }
  }
  public static int[] merge(int[] arr, int[] arr2){
    int[] ret = new int[arr.length + arr2.length];
    int indexOne = 0;
    int indexTwo = 0;
    int curr = 0;
    while(indexOne <= (arr.length - 1) && indexTwo <= (arr2.length -1)){
      if(arr[indexOne] > arr2[indexTwo]){
        ret[curr] = arr[indexOne];
        indexOne += 1;
        curr += 1;
      }
      else{
        ret[curr] = arr2[indexTwo];
        indexTwo += 1;
        curr += 1;
      }
    }
    if(indexOne < (arr.length - 1)){
      //put the rest of whatever in the end
      for(int i = indexOne; i < ret.length; i++){
        ret[curr] = arr[indexOne];
        curr += 1;
      }
    }
    else if(indexTwo < (arr2.length - 1)){
      for(int i = indexTwo; i < ret.length; i++){
        ret[curr] = arr2[indexTwo];
        curr += 1;
      }
    }
    return ret;
  }

}
