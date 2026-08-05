import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      long w = sc.nextLong();
      long h = sc.nextLong();
      long area = 0;
      for(int i=0;i<4;i++){
        long p = sc.nextLong()-1;
        long x = sc.nextLong();
        long y = x;
        while(p-->0) y = sc.nextLong();
        area = Math.max(area, (y-x)* (i<2 ? h : w));
      }
      System.out.println(area);
    }
  }
}
// 0.5*(z-x) * h   +   0.5*(y-z)*h
// ((z-x) * 0.5h) + ((y-z) * 0.5h)
// h * (z-x)+(y-z)
// h * (y-x)
