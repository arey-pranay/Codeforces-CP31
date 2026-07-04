import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int ans = Integer.MAX_VALUE;
      int evens = 0;
      for(int i=0;i<n;i++){
          int num = sc.nextInt();
          ans = Math.min(ans, (k-num%k)%k);
          if(k==4) if(num%2==0) evens++;
      }
      if(k==4){
          if(evens > 1) ans =0;
          else if(evens == 1) ans = Math.min(ans,1);
          else ans = Math.min(ans,2);
      }
      System.out.println(ans);
    }
  }
}
