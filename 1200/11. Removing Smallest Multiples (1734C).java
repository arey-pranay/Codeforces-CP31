  import java.util.*;
  public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      String s= sc.next();
      long ans = 0;
      boolean[] removed = new boolean[n+1];
      for(int i =1;i<=n;i++) {
         for(int j=i;j<=n;j+=i){
            if(s.charAt(j-1)=='1') break;
            if(!removed[j]){ ans += i; removed[j] = true;}
          }
      }
      System.out.println(ans);
    }
  }    
}   
