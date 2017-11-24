//remove duplicates from a linkedList in java
//Test Case: 1-->2-->1-->3-->4
public void removeDups(LinkedList head){
  HashSet<Node> seen = new HashSet<Node>();
  Node curr = head;
  Node prev = null;
  while(curr != null){
    //if it's already there
    if(seen.contains(curr)){
      prev.next = curr.next;
    }
    else{
      seen.add(curr);
    }
    //iterate over that linkedlist
    prev = curr;
    curr = curr.next;
  }
}


//Without a temporary buffer, you would have to sort the linkedList,
//and then remove duplicates that way?
//Or you would look at every other element after you look at each element and then
//remove the duplicate ones--> O(n^2) solution
