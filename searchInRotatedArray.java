class searchInRotatedArray{
  public static void main(String[] args){

  }
  public static int search(int[] arr, int k){
    //find the point where the beginning of the array is (the point where the rotation stops)
    int rotation = 0;
    for(int i = 0; i < arr.length - 1; i++){
      if(arr[i] > arr[i+1]){
        rotation = i + 1;
      }
    }
    int currIndex = (arr.length + 1) / 2;
    int currElt = arr[currIndex];
    while(currElt != k){
      if(currElt < k){

      }
    }
  }
}
