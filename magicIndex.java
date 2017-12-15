class magicIndex{
  public static void main(String[] args){
    System.out.println(magicIndex2(new int[]{-1, 0, 1, 3}));
  }
  //Naive approach
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
  //Binary search approach
  public static int magicIndex2(int[] arr){
    int low = 0;
    int high = arr.length - 1;
    while(low < high){
      int mid = (high + low)/2;
      if(arr[mid] == mid){
        return mid;
      }
      System.out.println(mid);
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
