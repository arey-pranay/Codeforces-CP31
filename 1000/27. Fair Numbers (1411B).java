import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        long n = sc.nextLong();
       while(!check(n)) n++;
       System.out.println(n);
  }
}
  public static boolean check( long n){
      long N  = n;
      while(n!=0){
        long rem =n%10L;
        if(rem!=0&&N%rem!=0) return false;
        n/=10;
      }
      return true;
    }
  }
