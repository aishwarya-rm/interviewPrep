import java.util.*;
class quickSort{
  public static void main(String[] args){
    int[] arr = new int[]{1, 5, 4, 2, 3};
    quickSort(arr, 0, arr.length - 1);
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
  }
  public static void recursiveQuickSort(int[] arr, int start, int end){
    int idx = helper(arr, start, end);
    if(start < idx - 1){
      recursiveQuickSort(arr, start, idx - 1);
    }
    if(end > idx){
      recursiveQuickSort(arr, idx, end);
    }
  }
  public static int helper(int[] arr, int low, int high){
    //It's one element, it's sorted
    int l = low;
    int h = high;
    int m = (l + h)/2;
    //sort everything such that the elements lower than the middle element are on the left and the elements greater are on the right
    while(l <= h){
        while(arr[l] <= arr[m]){
          l++;
        }
        while(arr[h] >= arr[m]){
          h--;
        }
        if(l <= h){
          System.out.println(l);
          int temp = arr[l];
          arr[l] = arr[h];
          arr[h] = temp;
          l++;
          h--;
        }
        for(int i = 0; i < arr.length; i++){
          System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
    return l;
  }
}
