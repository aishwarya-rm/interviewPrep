class binaryTreeSearchRecursive.java{
  class Node{
    int val;
    Node left;
    Node right;
    Node(int x){val = x;}
  }
  public static void main(String[] args){

  }
  public boolean contains(Node root, int find){
    if(root == null){
      return false;
    }
    if(root.val == find){
      return true;
    }
    return contains(root.left, find) || contains(root.right, find);
  }
}
