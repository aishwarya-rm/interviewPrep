public class lemonadeChange {
    public boolean lemonadeChange(int[] bills) {
       int[] cash = new int[]{0, 0, 0};
       for(int i = 0; i < bills.length; i++) {
          int b = bills[i];
          if(b == 5) {
              cash[0] += 1;
          }
          else if(b == 10) {
              if(cash[0] == 0) {
                  return false;
              }
              cash[0] -= 1;
              cash[1] += 1;
          }
          else {
              cash[2] += 1;
              if(cash[1] == 0) {
                  if(cash[0] < 3) {
                      return false;
                  }
                  else {
                      cash[0] -= 3;
                  }
              }
              else {
                  if(cash[0] < 1) {
                      return false;
                  }
                  cash[1] -= 1;
                  cash[0] -= 1;
              }
          }
       }
       return true;
    }
}
