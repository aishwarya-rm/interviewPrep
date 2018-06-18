import java.util.*;
public class maxSumSubarray {
    public static void main(String[] args) {

    }

    public static int bruteForce(int[] nums) {
        int overallMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
                if (sum > overallMax) {
                    overallMax = sum;
                }
            }
        }
        return overallMax;
    }

    public static int divideAndConquer(int[] nums) {
        
    }
}
