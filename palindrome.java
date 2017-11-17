import java.util.*;
class palindrome {
  public static void main(String[] args){
    List<Integer> testList = new LinkedList<Integer>();
    testList.add(1);
    testList.add(2);
    testList.add(1);
  }
  public static boolean isPalindrome(List<Integer> list){
    while(tail != head){
      if(tail.val != head.val){
        return false;
      }
      tail = tail.next;
      head = head.prev;
    }
  }
  return true;
}
