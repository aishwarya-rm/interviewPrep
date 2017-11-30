class tripleStep{
  public static void main(String[] args){
    System.out.println(tripleStep(3));
  }
  public static int tripleStep(int n){
    if(n <= 1){
      return 1;
    }
    return tripleStep(n-1) + tripleStep(n-2) + tripleStep(n-3);
  }
}
