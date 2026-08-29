import java.util.*;
public class Main{
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){  
          int n = sc.nextInt();
           int prev = sc.nextInt();
            int ans = prev;
          int sum = prev;
          for(int i=1;i<n;i++){
             int num = sc.nextInt();
             if((prev%2==0) != (num%2==0)) sum = Math.max(num,sum+num);
             else sum=num;
             ans = Math.max(ans,sum);
             prev = num;
          }
          System.out.println(ans);
      }
    }
}
//Kadane's algorithm with parity check condition
