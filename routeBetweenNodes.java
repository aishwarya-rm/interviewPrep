class routeBetweenNodes{
  public static void main(String[] args){

  }
  public static boolean route(Node g, Node start, Node end){
    boolean seenStart = False;
    boolean seenEnd = False;
    //need to find the start Node
    //Use BFS to find the start node
    Queue<Node> q = new Queue<Node>();
    q.push(g);
    while(!q.isEmpty()){
      Node curr = q.pop();
      if(curr == start){
      }
    }
    //check to see from there if there is a path to the end node
  }
}
