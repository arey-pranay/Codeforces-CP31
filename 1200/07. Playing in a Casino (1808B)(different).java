import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[][] arr = new long[n][m];
      long ans = 0;
      for(int i=0;i<n;i++) for(int j=0;j<m;j++) arr[i][j] = sc.nextLong();
      for(int j=0;j<m;j++) {
        long[] val = new long[n];
        for(int i=0;i<n;i++) val[i] = arr[i][j];
        Arrays.sort(val);
        // now we have like 1 3 7 etc. so |1-3| = 2. because 1 gives -1 and 3 gives +3.
        for(int i=0;i<n;i++){
          ans += val[i]*i; // every number will positively contribute its value to all numbers above it
          ans -= val[i]*(n-1-i); // every number will negatively contribute its value to all numbers above it
        }
      }
      System.out.println(ans);
    }
  }
}
