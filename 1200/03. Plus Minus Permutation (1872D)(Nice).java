import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      long n = sc.nextLong();
      long x = sc.nextLong();
      long y = sc.nextLong();
      
      long lcm = x*y/gcd(x,y);
      long commonM = n/lcm;    
      long pos = n/x - commonM;
      long neg = n/y - commonM;
      System.out.println(seriesSum(n)- seriesSum(n - pos) - seriesSum(neg));
      // we need to add biggest n/x numbers, then subtract the n/y numbers
      // but there will be common positions, like for x=2 y=3 the position 6 will have a number that is present in both, so that position is not usable
      // all such positions will be the common multiples of x,y in the range 1 to n. i.e., n/lcm; so we subtract those positions from both
      // now if n=9, x=3, y=2. then  we need 7+8+9 - 1+2. largest n/x minus smallest n/y.
      // so ((1..9)-(1..7) - (1..2)) => that is the code
    }
  }
  private static long seriesSum(long n){
    return n*(n+1)/2;
  }
  private static long gcd(long a , long b){
    if(b==0) return a;
    return gcd(b,a%b);
  }
}
