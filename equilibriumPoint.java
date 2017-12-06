import java.util.*;
class equilibriumPoint{
  public static void main(String[] args){

  }
  public static int equilibriumPoint(int[] arr){
    //returns the index of the equilibrium point in an array
    int totalSum = 0;
    int leftSum = 0;
    for(int i = 0; i < arr.length; i++){
      totalSum += arr[i];
    }
    for(int i = 0; i < arr.length; i++){
      if(totalSum == leftSum){
        return i;
      }
      else{
        totalSum -= arr[i];
        leftSum += arr[i];
      }
    }
    return -1;
  }
}
