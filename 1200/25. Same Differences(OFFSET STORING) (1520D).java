import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      HashMap<Long,Long> candidates = new HashMap<>();
      int n = sc.nextInt();
      long count = 0;
      for(int i =1;i<=n;i++){
        long curr = sc.nextLong();
        long offset = curr - i;
        long oldVal = candidates.getOrDefault(offset,0L);
        count += oldVal;
        candidates.put(offset,oldVal+1);
      }
      System.out.println(count);
    }
  
  }
}
