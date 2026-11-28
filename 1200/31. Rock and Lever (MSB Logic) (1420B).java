import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long ans = 0;
      long[] msbs = new long[63]; // by msb here I mean the first set bit from left
      
      for(int i=0;i<n;i++) {long x = sc.nextLong(); int msb = 63 - Long.numberOfLeadingZeros(x); msbs[msb]++;}  
      // if msb is same then AND will be greater always, because it will get 1 extra power of 2.
      //because even if everything on its right go to the XOR ans, even then just 1 extra power of 2 is more than the together
      
      for(long freq : msbs) ans+= freq*(freq-1)/2.0; // for every group (numbers having same msb), we can count the number of pairs using the formula n*(n-1)/2;
      System.out.println(ans);
    }
  }
}
