//check_string

// public class lec8 {
//     public static void main(String[] args) {
//         String str = "123 ";
//         int result = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) < '0' || str.charAt(i) > '9') {
//                 result = result + 1;
//             }

//         }
//         if (result == 1) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }

//     }

// }



//------------------x-----------------x--------------
//consecutive_rem
// public class lec8 {
//     public static void main(String[] args) {
//         String str1 = "aaabbccdaaaeff";
//         String result = "";
//         result += str1.charAt(0);

//         for (int i = 1; i < str1.length(); i++) {
//             if (str1.charAt(i) != str1.charAt(i - 1)) {
//                 result += str1.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }

// }

//------------------x-----------------x--------------
// maxnum 

// public class lec8{
//     public static void main(String[] args) {
//         String str ="aaabbccccdd";
        
//     }
    
// }





//------------------x-----------------x--------------


// maxnum 

// public class lec8{
//     public static void main(String[] args) {
//         String str=" a5b3c59efiz4";
//         char max ='0';

//         for(int i=0; i<str.length(); i++){
//             char ch =str.charAt(i);
//             if(ch>='0' && ch<='9' && ch > max){
//                max=ch;
//             }
//         }
//         System.out.println(max);
//     }
    
// }

//------------------x-----------------x--------------

// mul_string

// public class lec8{
//     public static void main(String[] args) {
//         String s1= "12";
//         String s2 ="3";
//         int num1=0;
//         int num2=0;
//         for(int i=0; i<s1.length(); i++){
//             num1= num1 * 10 +(s1.charAt(i)-'0');
//         }
//          for(int i=0; i<s2.length(); i++){
//             num2= num2 * 10 +(s2.charAt(i)-'0');
//         }

//         System.out.println(num1 * num2);

//         }
    
// }

//------------------x-----------------x--------------

// recursion

// public class recursion
// {
//     static void printnumber(int n){
//         if(n>10){
//             return;
//         }
//         System.out.println(n);
//         printnumber(n+1);
//     }
//     static int fact(int n){
//         if(n==1) return 1;
//         return n * fact(n-1);
//     }

//     public static void main(String[] args){
//         printnumber(1);
//         fact(5);
//     }
// }


//------------------x-----------------x--------------

// removechar

// public class lec8{
//     public static void main(String[] args) {
//         String str="abc";
//         char remove ='a';
//         String result="";
//         for (int i=0; i<str.length(); i++){
//             if(str.charAt(i)!=remove){
//                 result+= str.charAt(i);
//             }
//         }
//         System.out.println(result);


//     }
// }

//------------------x-----------------x--------------

// substring

// public class lec8{
//     public static void main(String[] args) {
//         String str= "abc";
//         // String str1= " ";
//         int count=0;
//         for(int i=0; i<str.length(); i++){
//             for(int j=i; j<str.length(); j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     count++;
//                 }

//             }
//         }
//         System.out.println(count);
//     }
    
// }
//------------------x-----------------x--------------