// Consider each bit position independently.

// Since the bitwise AND must be zero, at least one array element must have that bit equal to 0.

// To maximize the sum, we should set that bit to 1 in as many elements as possible.

// Therefore, for every bit position:

// Exactly n−1 elements have that bit set to 1.
// Exactly one element has that bit set to 0.
// There are n choices for the position of the zero bit.

// Since there are k independent bit positions, the total number of arrays is:Answer n^k
  
import java.util.*;
public class Main{
  static long MOD = 1_000_000_007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      long n = sc.nextLong();
      long k = sc.nextLong();
     System.out.println(modExp(n,k));
      
    }
  
  }
  public static long modExp(long n, long k){
    long ans = 1;
    while(k>0){
      if( (k&1) == 1 ) ans = (ans*n)%MOD;
      n =(n* n)%MOD;
      k >>= 1;
    }
    return ans;
  }
}
