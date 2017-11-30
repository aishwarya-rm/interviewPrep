import java.util.*;
class heapSort{
  public static void main(String[] args){
    int[] arr = new int[]{1, 4, 3, 5, 6};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void swap(int[] arr, int i, int j){
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
  public static void heapify(int[] arr, int i){
    int len = arr.length - 1;
    int lChild = i*2;
    int rChild = lChild + 1;
    int root = i;
    if(lChild <= len && arr[lChild] > arr[root]){
      root = lChild;
    }
    if(rChild <= len && arr[rChild] > arr[root]){
      root = rChild;
    }
    if(root != i){
      swap(arr, i, root);
      heapify(arr, root);
    }
  }
  public static void sort(int[] arr){
    int len = arr.length - 1;
    //sort the first half
    for(int i = len/2; i >= 0; i--){
      heapify(arr, i);
    }
    for(int i = len; i > 0; i--){
      swap(arr, 0, i);
      len --;
      heapify(arr, 0);
    }
  }

}
