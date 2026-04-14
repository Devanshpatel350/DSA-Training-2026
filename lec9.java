// public class add_digit {

//     public static  int sum(int n){
//         if(n==0) return 0;

//         return n%10 +sum(n/10);

//     }
//     public static void main(String[] args) {
//         int n=123;

//         System.out.println(sum(n));
//     }

// }

//count digit

// public class add_digit{

//     public static int count(int n){
//         if(n==0) return 0;
//         return 1+ count(n/10);

//     }
//     public static void main(String[] args) {
//         int n =6541;
//         System.out.println(count(n));
//     }
// }

//----------x-------------x---------------x-----------

//countarray_rec 

// public class lec9 {
//     static int countarrayofkey(int[] arr, int i, int key) {

//         if (i == arr.length)
//             return 0;
//         int count = (arr[i] == key) ? 1 : 0;
//         return count + countarrayofkey(arr, i + 1, key);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 2, 4, 2, 6, 7 };
//         int key = 2;
//         int i = 0;
//         System.out.println(countarrayofkey(arr, i, key));
//     }

// }

// // countzero
// public class lec9 {

//     public static int zero(int n) {
//         if (n == 0)
//             return 0;

//         int count = (n % 10 == 0) ? 1 : 0;
//         return count + zero(n / 10);

//     }

//     public static void main(String[] args) {
//         int n = 10101010;
//         System.out.println(zero(n));
//     }

// }

// // gcd
// public class lec9 {

//     static int gcdd(int a, int b) {
//         if (b == 0)
//             return a;
//         return gcdd(b, a % b);
//     }

//     public static void main(String[] args) {
//         int a = 12, b = 18;
//         System.out.println(gcdd(a, b));
//     }

// }

// // reverse

// public class lec9 {
//     public static void rev(int n) {
//         if (n == 0)
//             return;

//         System.out.print(n % 10);

//         rev(n / 10);

//     }

//     public static void main(String[] args) {
//         int n = 456;
//         rev(n);
//     }

// }

// // sumofarr_rec

// public class lec9 {
//     static int sumofarray(int[] arr, int i) {
//         if (i == arr.length)
//             return 0;
//         return arr[i] + sumofarray(arr, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int i = 0;
//         System.out.println(sumofarray(arr, i));
//     }

// }

// // x_n_recursion

// public class lec9 {

//     static int power(int x, int n) {
//         if (n == 0)
//             return 1;

//         return x * power(x, n - 1);

//     }

//     public static void main(String[] args) {
//         int x = 5;
//         int n = 2;
//         int result = power(x, n);
//         System.out.println(result);
//     }

// }
