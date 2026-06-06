// // Q. Balance Brackets
// // ()[]{}
// // true
         
// // ([)]
// // false


// import java.util.Stack;

// public class BalancedBrackets {
//     public static boolean isBalanced(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char ch : s.toCharArray()) {
//             // Push opening brackets
//             if (ch == '(' || ch == '[' || ch == '{') {
//                 stack.push(ch);
//             } 
//             // Check closing brackets
//             else if (ch == ')' || ch == ']' || ch == '}') {
//                 if (stack.isEmpty()) return false;
//                 char top = stack.pop();
//                 if ((ch == ')' && top != '(') ||
//                     (ch == ']' && top != '[') ||
//                     (ch == '}' && top != '{')) {
//                     return false;
//                 }
//             }
//         }
//         // Balanced if stack is empty at the end
//         return stack.isEmpty();
//     }

//     public static void main(String[] args) {
//         System.out.println(isBalanced("()[]{}"));         // true
//         System.out.println(isBalanced("([)]"));          // false
//         System.out.println(isBalanced("{[()]}"));       // true
//         System.out.println(isBalanced("((("));         // false
//     }
// }





//--------x----------x---------x---------
   




// input taken from user

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a string of brackets: ");
//         String input = sc.nextLine();

//         boolean result = isBalanced(input);
//         System.out.println(result);

//         sc.close();
//     }
// }