class Queue{

  public Node(int data){
    this.data = data;
  }
  LinkedList<Integer> head = new LinkedList<Integer>();
  public int pop(){
    Node newHead = new Node(head.next.data);
    int ret = head.data;
    head = newHead;
    return ret;
  }
  public void push(int data){
    Node curr = head;
    while(curr.next != null){
      curr = curr.next;
    }
    curr.next = new Node(data);
  }
  public int peek(){
    return head.data;
  }
}
