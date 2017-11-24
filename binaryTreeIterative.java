import java.util.*;
class binaryTreeIterative {
  class Node{
    int val;
    Node left;
    Node right;
    Node(int x){val = x;}
  }
  public static void main(String[] args){

  }
  public boolean findIterative(Node root, int find){
    if(root == null){
      return false;
    }
    //search through this tree using a stack for DFS
    //DFS is better when you're trying to find out whether an element is in a tree
    Stack<Integer> fringe = new Stack<Integer>();
    Set<Node> seen = new HashSet<Node>();
    //add the root onto the Stack
    fringe.push(root);
    //while the stack isn't empty, look through it
    while(!fringe.isEmpty()){
        Node curr = stack.pop();
        seen.add(curr);
        if(curr.val == find){
          return true;
        }
        //add all the children if they haven't been seen yet
        if(root.left != null){
          if(!seen.contains(root.left)){
            fringe.push(root.left);
          }
        }
        if(root.right != null){
          if(!seen.contains(root.right)){
            fringe.push(root.right);
          }
        }
    }
    return false;
  }
}
