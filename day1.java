import java.util.Scanner;
////////01/04/26/////

public class day1{
    //public static int add(int a, int b){
       // return a+b;
  //  }
    public static int day1day1(int n, int d) 
    {
       int count = 0;
       while(n>0){
        int rem = n%10;
        if(rem==d)
          count++;
        n=n/10;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // int d = sc.nextInt(); 
       // int sum = add(n,d);
//System.out.println("the value of a + b is = "+sum);
      Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt(); 
       int count = day1day1(n,d);
System.out.println("the value of count is = "+count);
     
      sc.close();
    }
}
