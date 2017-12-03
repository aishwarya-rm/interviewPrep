class validateBST{
  public static void main(String[] args){

  }
  public static boolean validateBST(Node n){
    if(n == null){
      return true;
    }
    if(n.left != null){
      if(n.left > n.val){
        return false;
      }
    }
    if(n.right != null){
      if(n.right < n.val){
        return false;
      }
    }
    return validateBST(n.left) && validateBST(n.right);
  }
}
