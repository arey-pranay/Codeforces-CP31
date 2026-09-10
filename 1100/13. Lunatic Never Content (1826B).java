import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long ans = 0;
      long[] arr= new long[n];
      for(int i = 0;i<n;i++) arr[i] = sc.nextLong();
      for(int i=0;i<n/2;i++) ans = gcd(ans, Math.abs(arr[i]-arr[n-1-i]));
      System.out.println(ans);
    }
  }
  public static long gcd(long a, long b){
     if(b==0) return a;
     return gcd(b,a%b);
  }
}
