import java.util. * ;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System. in );
    int t = sc.nextInt();
    while (t-->0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      long arr[] = new long[n];
      for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
      Arrays.sort(arr);
      long used = 0,
      ans = 0;

      for (int i = 0; i < n; i++) {
        long curr = arr[i];
        used += curr;
        long budget = x - used;
        if (budget < 0) break;
        ans += budget / (i + 1) + 1;
      }
      System.out.println(ans);
    }
  }
}
