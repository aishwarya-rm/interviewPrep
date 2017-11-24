//returns the node at the beginning of the loop
//Test A --> B --> C --> D --> E --> C
//You can't just test for when they collide (this won't return the node at the beignning
//of the collision)
public Node detectCircularList(LinkedList head){
  Node slow = head;
  Node fast = head;
  while(slow != fast){
    slow = slow.next;
    fast = fast.next.next;
  }
  slow = head;
  while(slow != fast){
    slow = slow.next;
    fast = fast.next;
  }
  return slow;
}
