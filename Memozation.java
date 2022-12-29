public class Memozation {
    // Memo Background: (0:40 - 0:42)
    // Q1 (0:42 - 0:45)
    public static long fibonacciMemozation(int n){
        return fibonacciMemozation(n, new long [n]);
    }
    public static long fibonacciMemozation(int n,long [] fib) {
        // base case: if n is 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        // if the Fibonacci number has already been calculated, return it
        if (fib[n] != 0) {
            return fib[n];
        }
        
        // the Fibonacci number at index n is the sum of the previous two numbers
        fib[n] = fibonacciMemozation(n - 1) + fibonacciMemozation(n - 2);
        return fib[n];
    }
    // Q2 (0:45 - 0:50)
    public static int count(int coins[], int n, int sum) {
 
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0){
            return 1;
        }
        // If sum is less than 0 OR there are no coins left and sum is greater than 0 then no solution exists
        if (sum < 0 || n <= 0){
            return 0;
        }
        // count is sum of solutions (1) including coins[n-1] (2) excluding the last coins[n-1]
        return count(coins, n - 1, sum)
            + count(coins, n, sum - coins[n - 1]);
    }
    //Q3 (0:50 - 1:00) TODO Implement recursively
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[] maxSub = new int[nums.length];
        for (int i = 0; i < maxSub.length; i++) {
            if (i == 0) {
                maxSub[i] = nums[i];
            } else {
                maxSub[i] = Math.max(nums[i], maxSub[i - 1] + nums[i]);
            }
            if (maxSub[i] > max) {
                max = maxSub[i];
            }
        }
        return max;
    }
    
        
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(arr);
        System.out.println("The maximum sum of a subarray is: " + maxSum);

        int coins[] = { 1, 2, 3 };
        int n = coins.length;
 
        System.out.println(count(coins, n, 4));
    }
    
}
