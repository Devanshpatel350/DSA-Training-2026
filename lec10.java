//------------x---------------x--------------x--------------
// //fib
// public class lec10{

//     static int fibb(int n) {
//         if (n <= 1)
//             return n;
//         return fibb(n - 1) + fibb(n - 2);

//     }

//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println(fibb(n));
//     }
// }
// -------------x---------------x--------------x--------------
// // path_str
// public class lec10 {
//     static void path(String str, int r, int c) {
//         if (r == 1 && c == 1) {
//             System.out.println(str);
//             return;
//         }
//         if (r > 1)
//             path(str + "D", r - 1, c);
//         if (c > 1)
//             path(str + "R", r, c - 1);
//     }

//     public static void main(String[] args) {
//         int r = 3;
//         int c = 3;
//         path(" ", r, c);

//     }
// }
// ------------x---------------x--------------x--------------
// // substr_count
// public class lec10{
//     // static int count=0;
//     public static int subset(String str) {
//         if (str.isEmpty()) {
//             return 1;
//         }
//         char ch = str.charAt(0);

//         return subset(str.substring(1)) + subset(str.substring(1));

//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         System.out.println(subset(str));
//     }

// }
// ------------x---------------x--------------x--------------
// // substr_rec
// public class lec10{
//     static void subset(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }
//         char ch = up.charAt(0);

//         subset(p + ch, up.substring(1));

//         subset(p, up.substring(1));

//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         subset(" ", str);
//     }
// }
// ------------x---------------x--------------x--------------