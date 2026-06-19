public class kadaneAlgo {

    public static void kadane(int num[] ) {

        int len=num.length;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
       
        // System.out.println(maxSum);

        for(int i=0;i<len;i++){
            currSum=currSum+num[i];

            if(currSum<0){
                currSum=0;
            }else if(currSum>maxSum){
                maxSum=currSum;
            }



        }
        System.out.println("max="+maxSum);
        

        // for(int i=0;i<len;i++){
        //     System.out.print(num[i]+"  ");
            
        //     for(int j=i+1;j<len;j++){
        //         int currSum=0;
        //         for(int k=i;k<=j;k++){
        //             System.out.print(num[k]+"  ");
        //             currSum+=num[k];
        //             if(currSum>maxSum){
        //                 maxSum=currSum;
        //             }
        //         }
        //     }
        //     System.out.println();
        // }
        System.out.println("maxsum="+maxSum);
        
    }
    public static void main(String[] args) {

        
        // int num[]={-1,2,-3,4};
        int num[]={1,-2,6,-1,3};

        kadane(num);


    }
}