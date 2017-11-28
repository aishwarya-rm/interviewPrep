import java.util.*;
class quickSort{
  public static void main(String[] args){
    int[] arr = new int[]{1, 5, 4, 2, 3};
    quickSort(arr, 0, arr.length - 1);
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
  }
  public static void quickSort(int[] arr, int low, int high){
    if(low >= high){
      return;
    }
    int middle = partition(arr, low, high);
    partition(arr, low, middle - 1);
    partition(arr, middle + 1, high);
  }
  public static int partition(int[] a, int low, int hi){
    int pivot = hi;
    int i =low;
    int j = hi;
    while(i<j)
    {
        if(a[i]<=a[pivot])
        {
            i++;
        }
        if(a[i]>a[pivot])
        {
          if((a[i]>a[pivot]) && (a[j]<=a[pivot]))
          {
              int temp= a[i];
              a[i]=a[j];
              a[j]=temp;
              i++;
          }
          if(a[j]>a[pivot])
          {
              j--;
          }
        }
    }
    return i;
  }
}
