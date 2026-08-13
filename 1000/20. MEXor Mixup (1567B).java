import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int xor = 0;
      int n = a-1;
      if(n % 4 == 0)xor = n;
      if(n % 4 == 1)xor = 1;
      if(n % 4 == 2)xor = n+1;
      if(n % 4 == 3)xor = 0;
      
      
      if(xor==b) System.out.println(a); else if((xor^a)==b) System.out.println(a+2); else System.out.println(a+1);
    }
  }
}
