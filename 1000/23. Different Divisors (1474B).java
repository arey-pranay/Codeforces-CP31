import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      int d = sc.nextInt();  
      int p = d+1;
      while(!isPrime(p)) p++;
      int q = p+d;
      while(!isPrime(q)) q++;
      System.out.println(p*q);
    }
  }
  private static boolean isPrime(int n){
    for(int i=2;i*i <= n; i++) if(n%i==0) return false;
    return true;
  }
}
