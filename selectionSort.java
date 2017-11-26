import java.util.*;
class selectionSort{
  public static void main(String[] args){
    int[] A = new int[]{1, 4, 3, 5, 2};
    int[] ret = selectionSort(A);
    for(int i = 0; i < ret.length; i++){
      System.out.print(ret[i]);
    }
  }
  public static int[] selectionSort(int[] arr){
    int currIndex = 0;
    int smallestIndex = 0;
    while(currIndex < arr.length){
      //find the smallest element
      int smallestElt = Integer.MAX_VALUE;
      for(int i = currIndex; i < arr.length; i++){
        if(arr[i] < smallestElt){
          smallestElt = arr[i];
          smallestIndex = i;
        }
      }
      int temp = arr[currIndex];
      arr[currIndex] = smallestElt;
      arr[smallestIndex] = temp;
      currIndex += 1;
    }
    return arr;

  }

}
