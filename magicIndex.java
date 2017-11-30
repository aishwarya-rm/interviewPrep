class magicIndex{
  public static void main(String[] args){
    
  }
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
}
