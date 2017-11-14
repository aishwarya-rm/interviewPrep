import java.util.*;
class StringCompression{
  public static void main(String[] args){
    System.out.println(stringCompression("aaabbbccc"));
    System.out.println(stringCompression("aishwarya"));
    System.out.println(stringCompression("abcdefghijklmn"));
  }
  public static String stringCompression(String s){
    char[] sArr = s.toCharArray();
    Arrays.sort(sArr);
    int count = 1;
    char curr = s.charAt(0);
    String ret = "";
    for(int i = 1; i < sArr.length; i++){
      if(sArr[i] == sArr[i-1]){
        count += 1;
      }
      else{
        ret += curr;
        curr = sArr[i];
        ret += Integer.toString(count);
        count = 1;
      }
    }
    ret += curr;
    ret += Integer.toString(count);
    if(ret.length() >= s.length()){
      return s;
    }
    else{
      return ret;
    }
  }
}
