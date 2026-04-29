// //write a program to find minimum steps to reduce a number from n to 1,
// //  you can perfrom  any of the following-
// //n-1
// //n/2
// //n/3
// //recursionFunction


// // import java.lang.reflect.Array;

// // public class lec14 {
// //    static int minSteps(int n,int[] dp){
// //     if(n ==1)
// //         return 0;
// //     if(dp[n] != -1)
// //         return dp[n];
// //     int ans = minSteps(n, dp);

// //     if(n%2 == 0){
// //         ans = Math.min(ans, minSteps(n/2, dp));
// //     }
// //     if(n%3 == 0){
// //         ans = Math.min(ans, minSteps(n/3, dp));
// //     }
// //     dp[n]=1 + ans;
// //     return dp[n];
// //    }  
// //     public static void main(String[] args) {
// //         int n= 10;
// //         int[] dp = new int[n+1];
// //         Array.file(dp,-1);
// //         System.out.println(minSteps(n, dp)); 
// //     }
// // }



// //w...a....p..... to  find the number of steps to reach 1 from n.
// // n = 4
// //1111
// //112
// //121
// //211
// //22





// // import java.util.Arrays;

// // public class lec14 {
// //    static int minSteps(int n,int[] dp){
// //     if(n ==0) return 1;
// //     if(n<0) return 0;
// //         if(dp[n] != 0)
// //           return dp[n];
// //     dp[n]= minSteps(n-1, dp)+ minSteps(n-2, dp);
// //       return dp[n];

   
// //    }  
// //    public static void main(String[] args) {
// //         int n= 4;
// //         int[] dp = new int[n+1];
// //         Arrays.fill(dp,0);
// //         System.out.println(minSteps(n, dp)); 
// //     }
// // }

// //

// import java.util.Arrays;

// public class lec14 {
//    static int minSteps(int n,int[] dp){
   
//     if(i>=arr.length) return 0;
   
//     if(dp[i]!=-1) return dp[i];
    
//     int x = arr[i]+minSteps(arr,i+2,dp);
//     int y = minSteps(arr,i+1,dp);
//     dp[i]=Math.max(x,y);
//     return dp[i];
    
   
//    }  
//    public static void main(String[] args) {
//         int[] arr = {2,1,4,9};
//         int[] dp = new int[arr.length];
//         Arrays.fill(dp,-1);
//         int i=0;
//         System.out.println(minSteps(n, dp)); 
//     }
// }
// //w...a.....p..... to find the maximum sum of a subsequence with no adjacent element in an array 
// //arr = {2,1,4,9}
// //out = (9+1) =10



// //string str="12" decode
// //1  2  -> ab
// //1  2  -> L
// //ans -> 2

// import java.util.Arrays;
// //recursionfunction
// public class lec14{
//     static int minSteps(String s, int i, int[] dp){
//         if(i == s.length) return 1;
//         if(s == "0") return  0;
//         if(dp[i] != -1) return dp[i];
//         int one = minSteps(s,i+1, dp);
//         int two = 0;
//         if(i+1< s.length()){
//             two = s.charAt(i) - '0' +(s.charAt(i+1)-'0');
//             if(num <= 26){
//                 two = minSteps(s, i+2, dp);
                
//             }
//             return dp[i] = one + two;
//         }
//          public static void main(String[] args) {
//         String s = "12";
//         int[] dp = new int[s.length()];
//         Arrays.fill(dp,-1);
//         int i=0;
//         System.out.println(minSteps(s, i, dp)); 
//     }
// }
    