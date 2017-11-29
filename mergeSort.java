import java.util.*;
class mergeSort{
  public static void main(String[] args){
    int[] ret = new int[]{1, 4, 3, 2, 6};
    mergeSort(ret);
    for(int i = 0; i < ret.length; i++){
      System.out.print(i);
    }
    System.out.println(" ");
  }
  public static void mergeSort(int[] arr){
      //it's already sorted
      if(arr.length > 1){
        int mid = arr.length / 2;
        int[] left = new int[mid];
        System.arraycopy(arr, 0, left, 0, mid);
        for(int i = 0; i < left.length; i++){
          System.out.print(left[i]);
        }
        System.out.println(" ");
        mergeSort(left);
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        for(int i = 0; i < right.length; i++){
          System.out.print(right[i]);
        }
        System.out.println(" ");
        mergeSort(right);
        merge(left, right);
      }
  }
  public static int[] merge(int[] arr, int[] arr2){
    int[] ret = new int[arr.length + arr2.length];
    int indexOne = 0;
    int indexTwo = 0;
    int curr = 0;
    while(curr < ret.length){
      if(indexOne < arr.length && indexTwo < arr2.length){
        int elt1 = arr[indexOne];
        int elt2 = arr2[indexTwo];
        if(elt1 > elt2){
          System.out.print(elt1);
          ret[curr] = elt1;
          indexOne += 1;
        }
        else{
          System.out.print(elt2);
          ret[curr] = elt2;
          indexTwo += 1;
        }
        curr++;
      }
      if(indexOne < arr.length){
        System.out.print(arr[indexOne]);
        ret[curr] = arr[indexOne];
        indexOne++;
      }
      if(indexTwo < arr2.length){
        System.out.print(arr2[indexTwo]);
        ret[curr] = arr2[indexTwo];
        indexTwo++;
      }
      curr++;

    }
    return ret;
  }

}
