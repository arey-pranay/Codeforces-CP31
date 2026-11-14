import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      boolean[] balanced = new boolean[n];
      int zeroes = 0, ones = 0;
      for(int i=0;i<n;i++){ if(a.charAt(i)=='0') zeroes++; else ones++; if(zeroes==ones) balanced[i]=true;}
      boolean flip = false, ok = true;
      for(int i=n-1;i>=0;i--){
        char c = a.charAt(i);
        if(flip) c = c=='0'?'1':'0';
        char d = b.charAt(i);
        if(c!=d){
          if(balanced[i]) flip = !flip;
          else {ok = false; break;}
        }
      }
      System.out.println(ok ? "YES" : "NO");
    }
  }
}
