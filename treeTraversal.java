public class treeTraversal{
  public static void main(String[] args){

  }
  public static void inOrder(TreeNode root){
    if(root == null){
      return;
    }
    else{
      if(root.left != null){
        inOrder(root.left);
      }
      System.out.print(root.val);
      if(root.right != null){
        inOrder(root.right);
      }
    }
  }

  public static void preOrder(TreeNode root){
    if(root == null){
      return;
    }
    System.out.print(root.val);
    if(root.left != null){
      preOrder(root.left);
    }
    if(root.right != null){
      preOrder(root.right)''
    }
  }

  public static void postOrder(TreeNode root){
    if(root == null){
      return;
    }
    if(root.left != null){
      postOrder(root.left);
    }
    if(root.right != null){
      postOrder(root.right);
    }
    System.out.print(root.val);
  }
}
