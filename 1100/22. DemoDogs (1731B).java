import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int MOD = 1_000_000_007;
    while(t-->0){
      long n = sc.nextLong();

      // The most optimal way is => right down right down right down right down ....
      //   right => (n* n-1) and then down => n*n
      //   so for any given i, i*(i-1) + (i*i) => i^2 - i + i^2 => 2(i^2) - i
      
      // Sum(2(i^2) - i)
      //   Sum(2(i^2)) => 2*(n*(n+1)*(2n+1))/6 => (n*(n+1)*(2n+1))/3
      //   Sum(i) => (n)*(n+1)/2 
        
      // So difference of series =>  =>    ( 2n*(n+1)  *(2n+1)) -    3n*(n+1)      ) /6  =>  n*(n+1)(4n-1) /6
      //   We need to multiply it by 2022 (and 2022/6 = 337) 
      //   2022 * series => 2022 * n*(n+1)(4n-1) /6 => 337*n*(n+1)*((4*n)-1)
      //   taking MOD at needed places in the formula
        
      long ans = 337L * n % MOD * (n + 1) % MOD * (4 * n - 1) % MOD;     
      System.out.println(ans);
    }
  }
  
  
}
