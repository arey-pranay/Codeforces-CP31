import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      long n = sc.nextLong();
      long x = sc.nextLong();
      long y = sc.nextLong();
      HashMap<String,Long> hm = new HashMap<>(); // storing the count of "useful" representation of every number
      int ans = 0;
      for(int i=0;i<n;i++){
        long a = sc.nextLong();
        // (a+b) % x = 0 => (a%x + b%x)%x = 0 => a%x = -b % x. => a%x = (x-b)%x. So we need b = (x - (a%x))%x for this equation. need1 = (x - (a%x))%x
        long need1 = (x - (a%x))%x;
        // (a-b) % y = 0 => (a%y - b%y)%y = 0 => a%y = b%y. So we need the occurence b = a%y for this equation. need2 = a%y
        long need2 = a%y;
        String needKey = need1+","+need2;
        ans += hm.getOrDefault(needKey,0);
        String currKey = (a%x) + "," +(a%y);
        hm.put(currKey,hm.getOrDefault(currKey,0)+1);
      }
      System.out.println(ans);
    }
  }
}
