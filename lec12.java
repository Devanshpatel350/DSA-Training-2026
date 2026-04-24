// import java.util.*;
//   //digitcount
// public class lec12 {
//     static int dcount(int n , int[] dp) {
//         if(n==0) return 0;

//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         dp[n] = n%10 + dcount(n/10, dp);
//         return dp[n];
//         // n%10 likhne se sum ho jayegaa
//         // 1 likhne se count hogaa

//     }
//     public static void main(String[] args) {
//         int n= 839;
//         int[] dp = new int[n+1];
//         Arrays.fill(dp , -1);
//         System.out.println(dcount(n, dp));
//     }
    
// }

// ---------x----------x-------x-------x----------x----------x-----
// import java.util.*;

// //fib_obtmize
// public class lec12 {

//     static int fibo( int n, int[] dp) {
//         if(n<=1){
//             return n;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
//         return dp[n];
        
//     }
//     public static void main(String[] args) {
//         int n = 6;
//         int[] dp = new int [n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(fibo(n,dp));


//     }
    
// }


// ---------x----------x-------x-------x----------x----------x-----

// import java.util.*;
//   //ladder_opt
// public class lec12{

//     static int ways( int n, int[] dp) {
//         if(n==0 | n==1){
//             return 1;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         dp[n] = ways(n-1, dp) + ways(n-2, dp);
//         return dp[n];
        
//     }
//     public static void main(String[] args) {
//         int n = 6;
//         int[] dp = new int [n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n,dp));


//     }
    
// }
 

// ---------x----------x-------x-------x----------x----------x-----
 
// // palindrome_opt
// public class lec12 {
//     static int[][] dp = new int [100][100];
//     static boolean pali(String str, int start, int end){
//         if(start>=end) return true;
//         if(dp[start][end] != 0){
//             return dp[start][end]
//         }

//     }
//     public static void main(String[] args) {
        
//     }
// }


// ---------x----------x-------x-------x----------x----------x-----
//    //rev_opt
// public class lec12{
//     static String rev(String str, String[] dp) {
//         if(str.length()==0) return "";
//         int len= str.length();
//         if(dp[len]!= null) return dp[len];
//         dp[len]= rev(str.substring(1), dp) + str.charAt(0);
//         return dp[len];
        
//     }
//     public static void main(String[] args) {
//         String str = "hello";
//         String[] dp =new String[str.length()+1];
//         System.out.println(rev(str, dp));
        
//     }
    
// }


// ---------x----------x-------x-------x----------x----------x-----
// import java.util.Arrays;
//  //string_length
// public class lec12 {
//     static int length(String str, int[] dp) {
//         if(str.equals("")) return 0;
//         int len = str.length();
//         if(dp[len]!= -1){
//             return dp[len];
//         }
//         dp[len] = 1+ length(str.substring(1), dp);
//         return dp[len];
        
//     }

//     public static void main(String[] args) {
//         String str = "hello";
//         int[] dp = new int [str.length()+1];
//         Arrays.fill(dp, -1);
//         System.out.println(length(str, dp));
//     }
    
// }


// ---------x----------x-------x-------x----------x----------x-----
// import java.util.Arrays;
//  //subsequnce_opt
// public class lec12{
//     static int sub(String str, int i, int[] dp) {
//         if(i == str.length()) return 1;
//         if(dp[i] != -1) return dp[i];
//         int x= sub(str, i+1, dp);
//         int y= sub(str, i+1, dp);
//         dp[i] = x +  y;
//         return dp[i];
        
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         int[] dp = new int[str.length()+1];
//         Arrays.fill(dp,-1);
//         int i = 0;
//         System.out.println(sub(str, i, dp));

        
//     }
    
// }


// ---------x----------x-------x-------x----------x----------x-----
// import java.util.Arrays;
// //zerocount_opt
// public class lec12 {
//     static int count(int n, int[] dp)
//     {
//         if(n==0) return 0;
//         if(dp[n] != -1) return dp[n];
//         if(n%10==0)
//         {
//             dp[n] = 1+count(n/10,dp);
//         }
//         else{
//             dp[n] = count(n/10,dp);
//         }
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n = 10207000;
//         int [] dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(count(n,dp));
//     }
// }

// ---------x----------x-------x-------x----------x----------x-----