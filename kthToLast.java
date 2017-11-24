//return the kth to last element in the linkedlist
public Node kthToLast(LinkedList head, int k){
  //get a pointer to the end of the head list
  Node tail = head;
  int size = 1;
  while(tail.next != null){
    size += 1;
    tail = tail.next;
  }
  int goal = size - k;
  //go to the goal number of nodes
  Node curr = head;
  int currSeen = 1;
  while(curr != null){
    if(currSeen == goal){
      return curr;
    }
    curr = curr.next;
    currSeen += 1;
  }
}

//there's another iterative solution that's not as trivial as the one above
public Node kthToLast(LinkedList head, int k){
  Node k = head;
  Node curr = head;
  for(int i = 0; i < k; i++){
    if(k == null){
      return null;
    }
    k = k.next;
  }
  //iterate through the list and when k hits the end, return curr
  while(k.next != null){
    curr = curr.next;
    k = k.next;
  }
  return curr;
}
