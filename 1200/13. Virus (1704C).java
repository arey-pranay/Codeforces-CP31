import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] inf = new int[m];
      for(int i=0;i<m;i++) inf[i] = sc.nextInt();
      Arrays.sort(inf);
      int[] gaps = new int[m];
      for(int i=1;i<m;i++) gaps[i-1] = inf[i] - inf[i-1] - 1;
      gaps[m-1] = n- inf[m-1] + inf[0] - 1;
      Arrays.sort(gaps);
      int count = 0, saved = 0;
      for(int i=m-1;i>=0;i--){
          int left = gaps[i] - 2*count; // har gap will decrement by 2
          if(left <= 0) break;
          saved += left == 1 ? 1 : left-1;
          count += left == 1 ? 1 : 2;
      }
      System.out.println(n-saved);
    }
  }
}
