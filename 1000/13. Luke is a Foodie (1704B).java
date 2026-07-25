import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    while(tc-->0){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int L = a[0]-x;
        int R = a[0]+x;
        int count = 0;
        for(int i=1;i<n;i++){
            L = Math.max(L, a[i]-x);
            R = Math.min(R, a[i]+x);
            if(L > R){count++;L=a[i]-x;R=a[i]+x;}//agr koi valid number nahi bacha
        }
        System.out.println(count);
    }
  }
}
// 5 3
// 3 10 9 8 7
// L=7, R=6
