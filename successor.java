class successor{
  public static void main(String[] args){

  }
  //returns the in order successor of a node
  public static int successor(Node root){
    if(root == null){
      return null;
    }
    if(root.left != null && root.right != null){
      return root.right.val;
    }
    if(root.right != null){
      return root.right.val;
    }
    return root.val;
  }
}
