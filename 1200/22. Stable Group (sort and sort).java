import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      long k = sc.nextLong();
      long x = sc.nextLong();
      long a[] = new long[n];
      for(int i =0;i<n;i++) a[i] = sc.nextLong();
      Arrays.sort(a);
      int groups = 1;
      List<Long> gaps = new ArrayList<>();
      for(int i =1;i<n;i++){
        long gap = a[i]-a[i-1]; 
        if(gap>x) gaps.add((gap-1)/x);
      }
      Collections.sort(gaps);
      for(long cost : gaps){
        if(k>=cost) k-= cost;
        else groups++;
      }
      System.out.println(groups);
  }
}
// 1 _ _ 4 _ _ _ 7
