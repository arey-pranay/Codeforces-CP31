import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int t = sc.nextInt();
    while (t-- > 0) solve();
  } 
  private static void solve() {
   int n = sc.nextInt();
   int m = sc.nextInt();
   int[] freq = new int[m]; //0,1,2,..m-1. storing frequency of all mods values / (remainders)
   for(int i =0;i<n;i++) freq[sc.nextInt()%m]++;
    int ans = 0;
    if(freq[0] > 0) ans++;
    if(m%2==0 && freq[m/2] > 0) ans++;
    for(int curr = 1; curr<m-curr; curr++){
      int x = freq[curr], y = freq[m-curr];
      if(x==0 && y==0) continue;
      ans++;
      ans += Math.max(0,Math.abs(x-y)-1);
   }
   System.out.println(ans);
  }
}

