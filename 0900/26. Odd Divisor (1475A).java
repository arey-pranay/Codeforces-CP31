import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            if(n%2 != 0){
             System.out.println("Yes");
            } else {
              while(n%2 == 0 && n>1) n /= 2;
              if(n==1) System.out.println("No");
              else System.out.println("Yes");
           }
        }
  }
  public static boolean isPrime(int n){
    if(n==2)return true;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0) return false;
    }
    return true;
  }
}
