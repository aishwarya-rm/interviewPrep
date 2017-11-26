import java.util.*;
class sortedMerge2 {
  public static void main(String[] args){
    int[] A = new int[]{1, 2, 0, 0, 0, 0};
    int[] B = new int[]{4, 5, 6, 9};
    int[] ret = sortedMerge2(A, B);
    for(int i = 0; i < ret.length; i++){
      System.out.print(ret[i]);
    }
    System.out.println(" ");
  }
  public static int[] sortedMerge2(int[] A, int[] B){
    //find where the A length stops
    int AStop = 0;
    for(int i = 0; i < A.length; i++){
      if(A[i] == 0){
        AStop = i;
        break;
      }
    }
    int AIndex = AStop -1;
    int BIndex = B.length - 1;
    int currIndex = A.length - 1;
    //iterate backwards and put the element in the appropriate place
    while(BIndex >= 0){
      int AElt = A[AIndex];
      int BElt = B[BIndex];
      if(AElt > BElt){
        A[currIndex] = AElt;
        A[AIndex] = 0;
        AIndex -= 1;
      }
      else {
        A[currIndex] = BElt;
        B[BIndex] = 0;
        BIndex -= 1;
      }
      currIndex -= 1;
    }
    return A;
  }
}
