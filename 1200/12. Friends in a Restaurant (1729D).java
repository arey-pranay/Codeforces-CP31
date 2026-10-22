import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long[] x = new long[n];
      long[] y = new long[n];
      for(int i=0;i<n;i++) x[i] = sc.nextLong();
      for(int i=0;i<n;i++) y[i] = sc.nextLong();
      long[] diff = new long[n];
      for(int i=0;i<n;i++)diff[i] = y[i]-x[i];
      Arrays.sort(diff);
      int count = 0;
      int i=0, j=n-1;
      while(i<j)
        if(diff[i]+diff[j] >= 0){
          count++; i++; j--;
        } else i++;
      System.out.println(count);
    }
  }
}
