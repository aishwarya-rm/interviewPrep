class checkBalanced{
  public static void main(String[] args){

  }
  public static boolean checkBalanced(Node n){
    if(n == null){
      return true;
    }
    int difference = height(n.left) - height(n.right);
    return (Math.abs(difference) <= 1) && checkBalanced(n.left) && checkBalanced(n.right);
  }
  public static int height(Node n){
    if(n == null){
      return 0;
    }
    else{
      return 1 + max(height(node.left), heigh(node.right));
    }
  }
}
