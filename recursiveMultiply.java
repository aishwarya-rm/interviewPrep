class recursiveMultiply{
  public static void main(String[] args){
    System.out.println(multiply(10, 10));
  }
  public static int multiply(int a, int b){
    if(b == 0 || a == 0){
      return 0;
    }
    else{
      return helper(a, b);
    }
  }
  public static int helper(int a, int b){
    if(b <= 1){
      return a;
    }
    else{
      return a + helper(a, b-1);
    }
  }
}
