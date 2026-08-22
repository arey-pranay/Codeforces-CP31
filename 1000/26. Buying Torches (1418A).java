import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        long x= sc.nextLong();
        long y= sc.nextLong();    
        long k= sc.nextLong();    
        long totalSticks = (k + k*y) - 1; // we need k sticks, and k coal => k and k*y sticks. But we already have 1.
        long t1 = totalSticks/(x-1);      // trade 1 needs to be done sticks/x-1 because every t1 gives us x-1 more sticks
        if(totalSticks % (x-1) != 0) t1++; // ceiling division was needed because we may need another trade to get a few extra sticks
        long t2 = k;                       // each trade 2 gives us 1 coal, so we need to have t2 done k times
        long ans = t1+t2;                  // total numbers of trades = t1+t2
        System.out.println(ans);
  }
  }
}
