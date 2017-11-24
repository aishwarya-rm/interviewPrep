//Delete a node in the middle, only given access to that middle node in a
//singly linked list
//Test for the list 1--2--3 given only 2
//You don't even have to go to the end of the list
public boolean deleteMiddle(Node middle){
  //replace the previous node
  if(middle == null || middle.next == null){
    return false;
  }
  Node next = middle.next;
  middle.data = next.data;
  middle.next = next.next;
  return true;
}
