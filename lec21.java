// //MaxSumArrSumPrefix

// public class lec21 {
//     public static void maxSum(int num[] ) {
        
//         int len= num.length;
//         int num2[]=new int[len];
//         int maxSum=0;
//         num2[0]=num[0];
//         for(int i=1;i<len;i++){
            
//             num2[i]=num[i]+num2[i-1];
//         }

//         for(int i=0;i<len;i++){
//             int currSum=0;
//             for(int j=i+1;j<len;j++){
//                 currSum=i==0?num2[j]:num2[j]-num2[i-1];

//                 if(currSum>maxSum){
//                     maxSum=currSum;
//                 }

//             }
//         }
//         System.out.println(maxSum);
//         // return num2;
//         //  for(int i=0;i<len;i++){
           
//         //     System.out.println( num2[i]);
//         // }
       
//     }
//     public static void main(String[] args) {

//         int num[]={1,-2,4,-3,8,-5};
//         maxSum(num);
       

        
//     }
// }
//