// // #arr=[1,2,3]
// // 1> [1,2]
// // 2>[3]
// // t=2
// //subset
// import java.util.Arrays;
// public class lec15{
//     static int minSteps( int n, int[] dp) {
//         if(n<=2) return n;
//         if(dp[n] != -1) return dp[n];
//         dp[n] = minSteps(n-1, dp) + (n-1) * minSteps(n-2, dp);
//         return dp[n];
//     }
//    public static void main(String[] args){
//        int n = 3;
//        int[] dp = new int[n+1];
//        Arrays.fill(dp, -1);
//        System.out.println(minSteps(n, dp));
//    } 
// }

// //w...a...p...subset2
// import java.util.Arrays;
// public class subset2{
//     static int[][] dp = new int[100][100];
//     static int minSteps(int[] arr, int i, int k) {
//         if(k==0) return 1;
//         if(i == arr.length) return 0;
//         if(dp[i][k] != -1) return dp[i][k];
//         int x = 0;
//         if(arr[i] <= k) {
//             x = minSteps(arr, i+1, k-arr[i]);
//         }
//         int y = minSteps(arr, i+1, k);
//         dp[i][k] = x+y;
//         return dp[i][k];
//     }
//     public static void main(String[] args){
//          int[] arr = {1, 2, 3};
//          int k = 4;
//          for(int i=0; i<100; i++) {
//               Arrays.fill(dp[i], -1);
//          }
//          System.out.println(minSteps(arr, 0, k));
//         }
//     }


















//Q>
// [0 0 0
//  0 1 0
//  0 0 0
// ]
// output--> 2