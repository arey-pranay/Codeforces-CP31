import java.util.*;
public class Main{
 
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int[] last = new int[1001];// store only the last occurence of every numebr, so a n^2 on  10^5 becomes n^2 on 1-^3, because we now contraint by number range instead  of the array size
        int n  = sc.nextInt();
        for(int i =0;i<n;i++) last[sc.nextInt()] = i+1;
        int ans = -1;
        for(int i=1000;i>0;i--){
          if(last[i]==0) continue; // we never found the 'i' number in input
          for(int j=1000;j>0;j--){
            if(last[j]==0) continue; // we never found the 'j' number in input
            if(gcd(i,j)==1) ans = Math.max(ans,last[i]+last[j]);
          }
        }
        System.out.println(ans);
      }
  }
  public static int gcd(int a, int b){
    if(b==0) return a;
    return gcd(b,a%b);
  }
}
 
