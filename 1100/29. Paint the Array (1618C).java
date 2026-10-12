import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc =  new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        int j=0,k=0;
        long[] evens = new long[(n/2)+(n%2)];
        long[] odds  = new long[n/2];
        for(int i=0;i<n;i++){
          if(i%2==0)evens[j++] = sc.nextLong();  
          else odds[k++] = sc.nextLong();
        } 
        System.out.println(func(odds,evens));
    }
  }
  public static long func(long[] odds, long[] evens){
      long finalGcd = gcdAll(evens);
      if(noDivisible(odds,finalGcd)) return finalGcd;
      finalGcd = gcdAll(odds);
      if(noDivisible(evens,finalGcd)) return finalGcd;
      return 0;
  }
  
  public static long gcdAll(long arr[]){
    long g = arr[0];
    for(int i = 1;i<arr.length;i++) g = gcd(g, arr[i]);
    return g;
  }
  public static long gcd(long a, long b){
    if(b==0) return a;
    return gcd(b, a%b);
  } 
  public static boolean noDivisible(long arr[],long val){
    for(int i=0;i<arr.length;i++) if(arr[i]%val== 0) return false;
    return  true;
  }
}
