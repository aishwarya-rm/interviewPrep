import java.util.*;
class OneAway {
  public static void main(String[] args){
    System.out.println(oneAway("pale", "ple"));
    System.out.println(oneAway("pales", "pale"));
    System.out.println(oneAway("pale", "bale"));
    System.out.println(oneAway("pale", "bake"));
  }
  public static boolean oneAway(String s, String t){
    if(s == t){
      return true;
    }
    int difference = Math.abs(s.length() - t.length());
    if(difference > 1){
      return false;
    }
    //Check replace a character
    if(s.length() == t.length()){
      int replaced = 0;
      for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) != t.charAt(i)){
          replaced += 1;
        }
      }
      if(replaced > 1){
        return false;
      }
      return true;
    }
    else {
      //Check if you removed a character or added a character
      HashSet<Character> charSet = new HashSet<Character>();
      for(int i = 0; i < s.length(); i++){
        charSet.add(s.charAt(i));
      }
      int similarity = 0;
      for(int i = 0; i < t.length(); i++){
        if(!charSet.contains(t.charAt(i))){
          similarity += 1;
        }
      }
      if(similarity > 1){
        return false;
      }
      return true;
    }

  }
}
