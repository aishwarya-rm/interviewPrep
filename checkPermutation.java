import java.util.*;
class checkPermutation{
  public static void main(String[] args){
    System.out.println(checkPermutation("abc", "cba"));
    System.out.println(checkPermutation("aaa", "bbb"));
  }
  //Space complexity is O(n), time complexity, depending on the sorting algorithm would be around O(nlogn + n) which is O(nlogn)
  public static boolean checkPermutation(String s, String t){
    //It's a permuation if all the letters in one are in the other
    if(s.length() != t.length()){
      return false;
    }
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    Arrays.sort(sArr);
    Arrays.sort(tArr);
    for(int i = 0; i < sArr.length; i++){
      if(sArr[i] != tArr[i]){
        return false;
      }
    }
    return true;
  }
}
