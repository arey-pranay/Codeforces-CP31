import java.util.*;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        long[] arr = new long[n];
        long sum =0;
        for(int i = 0;i<n;i++){ arr[i] = sc.nextLong(); sum += arr[i]; }
        long before = 0;
        long max = 1;
        for(int i=0;i<n-1;i++){
          before += arr[i];
          long after = sum - before;
        //  System.out.print(" " + gcd(before,after));
          max = Math.max(max,gcd(before,after));
        }
        System.out.println(max);
      }
    }
    public static long gcd(long a , long b){
      if(b==0) return a;
      return gcd(b,a%b);
    }
}
