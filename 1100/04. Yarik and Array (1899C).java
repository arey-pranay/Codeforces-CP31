import java.util.*;
public class Main{
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){       
          int ans = Integer.MIN_VALUE;
          int n = sc.nextInt();
          int prev = sc.nextInt();
          int sum = prev;
          for(int i=1;i<n;i++){
             num = sc.nextInt();
             if(prev%2==0 != num%2==0) sum = Math.max(sum,sum+num);
             else sum=num;
             ans = Math.max(ans,sum);
             prev = num;
          }
          System.out.println(ans);
      }
    }
}

//Kadane's Algo with parity condition check
