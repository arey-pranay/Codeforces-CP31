import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
          int n = sc.nextInt();
          if(n % 2 == 0){
            System.out.println(n/2 + " " + n/2);
          } else if(isPrime(n)){
            System.out.println(1 + " " + (n-1));
          } else {
            int p = -1;
            for(int i=3; (long) i*i <= n; i+=2) if(n%i==0){p=i; break;}
            int a = n/p;
            int b = n-a;
            System.out.println(a + " " + b);
          }
        }
    } 
  public static boolean isPrime(int n){
    for(int i =2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
    return true;
  }
}
