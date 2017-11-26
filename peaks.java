//Algorithm:
//Sort the entire Array
//Start at the first element and then swap it with the adjacent left element
//Then, jump two elements and do it again
import java.util.*;
class peaks{
  public static void main(String[] args){

  }
  public static int[] peaks(int[] arr){
    int[] sorted = Array.sort(arr);
    //you pick the x smallest elements to be the valleys where x is
    int x = arr.length / 2;
    int ret = new int[arr.length];
    int valleyIndex = 0;
    for(int i = 0; i < arr.length; i++){
      if(i % 2 == 1){
        //we're at a valley, save the element and insert a valley element
        arr[i] = sorted[valleyIndex];

      }
    }
  }
}
