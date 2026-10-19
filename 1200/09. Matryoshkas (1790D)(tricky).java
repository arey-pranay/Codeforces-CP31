import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();  
      long ans= 0L;    
      HashMap<Long,Integer> hm = new HashMap<>();
      for(int i =0;i<n;i++){
        long curr = sc.nextLong();
        hm.put(curr,hm.getOrDefault(curr,0)+1);
      }
      for(long x : hm.keySet()){
        int curr = hm.get(x);
        int prev = hm.getOrDefault(x-1,0);
        ans += Math.max(0,curr-prev);
      }
      System.out.println(ans);

    }
  }
}
// 2
// 1
// 6
// 2
// 2
// 2
// 2
// 2
// 4
// 3
