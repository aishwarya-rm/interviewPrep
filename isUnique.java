import java.util.*;
class isUnique{
  public static void main(String[] args){
    System.out.println(isUnique("hello"));
    System.out.println(isUnique("abcd"));
    System.out.println(isUniqueWithoutSpace("hello"));
    System.out.println(isUniqueWithoutSpace("abcd"));
  }
  //This version requires O(n) space and has a time complexity of O(n)
  public static boolean isUnique(String s){
    HashSet<Character> chars = new HashSet<Character>();
    for(int i = 0; i < s.length(); i++){
        if(chars.contains(s.charAt(i))){
            return false;
        }
        chars.add(s.charAt(i));
    }
    return true;
  }
  //This version requires O(1) space and has a time complexity of O(n^2)
  public static boolean isUniqueWithoutSpace(String s){
    if(s.length() == 1 || s == null){
      return true;
    }
    for(int i = 0; i < s.length(); i++){
        for(int j = i + 1; j < s.length(); j++){
            if(s.charAt(i) == s.charAt(j)){
                return false;
            }
        }
    }
    return true;
  }

}
