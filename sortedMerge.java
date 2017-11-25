import java.util.*;
class sortedMerge{
  public static void main(String[] args){
    int[] A = new int[]{0};
    int[] B = new int[]{1, 2, 3, 4, 5};
    int[] ret = sortedMerge(A, B);
    for(int i = 0; i < ret.length; i++){
      System.out.print(ret[i] + " ");
    }
  }
  public static int[] sortedMerge(int[] A, int[] B){
    int[] ret = new int[A.length + B.length];
    int AIndex = 0;
    int BIndex = 0;
    int currIndex = 0;
    while(AIndex < A.length && BIndex < B.length){
      int AElt = A[AIndex];
      int BElt = B[BIndex];
      //put the lower of the two elements into the return array
      //increment the indeces appropriately
      if(AElt < BElt){
        AIndex += 1;
        ret[currIndex] = AElt;
      }
      else if(BElt < AElt){
        BIndex += 1;
        ret[currIndex] = BElt;
      }
      currIndex += 1;
    }
    //append the last bit of the last array that isn't accounted for
    if(AIndex >= A.length){
      //got to the end of A, append the rest of B
      //System.out.println("append the rest of b");
      for(int i = currIndex; i < ret.length; i++){
        ret[i] = B[BIndex];
        BIndex += 1;
      }
    }
    else if(BIndex >= B.length){
      //got to the end of B, append the rest of A
      for(int i = currIndex; i < ret.length; i++){
        ret[i] = A[AIndex];
        AIndex += 1;
      }
    }
    return ret;
  }
}
