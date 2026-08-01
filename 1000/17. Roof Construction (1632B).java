import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
          int n = sc.nextInt();
          int p = bp(n-1);
          for(int i=n-1;i>=p;i--) System.out.print(i+" ");
          for(int i=0;i<p;i++) System.out.print(i+" ");
          System.out.println();
        }
    } 
  public static int bp(int n){ //breaking point
    int k = (int)(Math.log(n)/Math.log(2));
    return 1<<k;
  }
}
