/* Given an array, find the index i such that A[i] == i. This is called the
 * magic index */

class magicIndex{
  /* Testing */
  public static void main(String[] args){
    System.out.println(magicIndex2(new int[]{-1, 0, 1, 3}));
  }

  /* Naive approach: Strategy is just to do a linear search */
  public static int magicIndex(int[] arr){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > arr.length - 1){
        return -1;
      }
      if(arr[i] == i){
        return i;
      }
    }
    return -1;
  }

  /* More complex: Strategy is to do a binary search through the array */
  public static int magicIndex2(int[] arr){
    int low = 0;
    int high = arr.length - 1;
    while(low <= high){
      int mid = (high + low)/2;
      System.out.println("Low: " + low);
      System.out.println("High: " + high);
      System.out.println("Mid: " + mid);
      if(arr[mid] == mid){
        return mid;
      }
      if(arr[mid] > mid){
        high = mid - 1;
      }
      else if(arr[mid] < mid){
        low = mid + 1;
      }
    }
    return -1;
  }
}
