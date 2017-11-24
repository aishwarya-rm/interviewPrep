//Delete a node in the middle, only given access to that middle node in a
//singly linked list
//Test for the list 1--2--3 given only 2
public void deleteMiddle(Node middle){
  //replace the previous node
  Node next = middle.next;
  while(next != null){
    middle.val = next.val;
    middle.next = next;
    next = next.next;
  }
}
