//binarySearch



import java.util.Scanner;

public class lec20 {

    public static int  binarySearch(int num[],int key) {

        int start=0 , end=num.length-1;
        int mid=0;
        while(start<=end){
             mid = (start+end)/2;

            if(num[mid]==key){
                // System.out.println("found in "+mid);
                return mid;
            }else if(num[mid]>key){
                end=mid-1;
            }else {
                start=mid+1;
            }
           


        }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("SEARCH NUM B/W 1 - 58 ");

        int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13,24,36,47,58};
        int key=sc.nextInt();
        int ans=binarySearch(num, key);
        System.out.println("KEY FIND IN -> "+ans);
        // System.out.println(binarySearch(num, key));
    }
}

//reverseArray
public class reverseArray {
    public static int [] reverse(int num[]) {
        int len= num.length-1;
        // int j=0;
        for(int i=len,j=0;i>=0,j<len;i++,j++){
            num[j]=num[i];
            
        }
        return num[];
    }
    public static void main(String[] args) {
        int num[]={1,2,4,6,8};
        // int rever[]={};
        reverse(num);
    }
}