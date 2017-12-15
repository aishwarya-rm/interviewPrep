class Queue2Stacks {
  public static Stack in = new Stack();
  public static Stack out = new Stack();

  public static void enqueue(int elt){
    if(elt != null){
      in.push(elt);
    }
  }

  public static int dequeue(){
    if(out.isEmpty()){
      //push everything from in onto the stack
      while(!in.isEmpty()){
        out.push(in.pop());
      }
    }
    return out.pop();
  }
}
