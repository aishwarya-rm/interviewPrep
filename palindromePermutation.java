import java.util.*;
class palindromePermutation{
  public static void main(String[] args){
    System.out.println(palindromePermutation("Tact Coa"));
    System.out.println(palindromePermutation("aAaAaAb"));
  }
  public static boolean palindromePermutation(String s){
    //there should be two of each letter, except an odd number of only one letter
    HashMap<Character, Integer> charSet = new HashMap<Character, Integer>();
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == ' '){
        continue;
      }
      char sChar = Character.toLowerCase(s.charAt(i));
      if(charSet.get(sChar) != null){
        charSet.put(sChar, charSet.get(sChar) + 1);
      }
      else{
        charSet.put(sChar, 1);
      }
    }

    //go through the the hashset and if there's more than one char with odd numbers, return false, else return true
    int numberOdd = 0;
    for(Character c: charSet.keySet()){
      if(charSet.get(c) % 2 == 1){
        numberOdd += 1;
      }
    }
    if(numberOdd > 1){
      return false;
    }
    return true;
  }
}
