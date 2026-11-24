import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    while(t-->0){
      long n= sc.nextLong();
      long k= sc.nextLong()-1;
      long normal = k;
      int interval = (int)Math.floor(n/2);
      long skip =(n%2==0) ? 0 :k/interval;
      long ans = ((normal+ skip)%n) + 1;
      System.out.println(ans);
    }
  }
}



// B A
// 1 11
// 2 10
// 3 9
// 4 8
// 5 7
// 7 6   -> c1 
// 8 5
// 9 4
// 10 3
// 11 2
// 2 1   -> c2
//   har Math.floor(n/2) pe collision hai

// a%n + b%n = a+b %n 
