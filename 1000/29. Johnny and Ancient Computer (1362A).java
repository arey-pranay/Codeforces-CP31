import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int t =sc.nextInt();
    while(t-->0){
      long a = sc.nextLong();
      long b  = sc.nextLong();
      System.out.println(func(a,b));
    }
  }
  public static int func(long a, long b){
    if(a>b)return func(b,a); 
    long quot = b/a;
    int count=0;
    if(quot*a != b)return -1;
    while(quot>=8 && quot%8==0) {count++; quot/=8;}
    while(quot>=4 && quot%4==0) {count++; quot/=4;}
    while(quot>=2 && quot%2==0) {count++; quot/=2;}
    return quot==0 || quot == 1 ? count : -1;
  }
}
