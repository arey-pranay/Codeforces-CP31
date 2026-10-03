import java.util.*;
public class Main{
  public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n= sc.nextInt();
        long low= sc.nextLong();
        long high= sc.nextLong();
        long[] arr = new long[n];
        we know that gcd is never greater than smaller number. let's keep 1 number 
        block : {
          for(int i=1;i<=n;i++){
            long quot =  (low/i);
            long rem = low%i;
            long x = rem==0 ? low : i * (quot+1); 
            // 1000 is divisible by 2, so 1000 can be paired by 2, giving gcd of 2. But 1000 is not divisible by 3, so we need multiple just greater than 3.
            arr[i-1] = x;
             System.out.print(gcd(i,x)+" ");
            if(x>high){ System.out.println("NO"); break block;}
          }
          System.out.println("YES");
          for(int x : arr)System.out.print(x+" ");
          System.out.println();
        }
      
    }
  }
  private static int gcd(int a, int b){
    if(b==0) return a;
    return gcd(b,a%b);
  }
}
  

// quot = 1000 => 1001
// quot = 500  => 1002
// quot = 333  => 1002


// 1 se 9
  
// 1000 se 2000

//   x>1000
