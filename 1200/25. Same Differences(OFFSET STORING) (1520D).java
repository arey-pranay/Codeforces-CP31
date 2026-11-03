import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
   
    while(t-->0){
       HashMap<Integer,Integer> candidates = new HashMap<>();
      int n = sc.nextInt();
      int count = 0;
      for(int i =1;i<=n;i++){
        int curr = sc.nextInt();
        int offset = curr - i;
        int oldVal = candidates.getOrDefault(offset,0);
        count += oldVal;
        candidates.put(offset,oldVal+1);
      }
      System.out.println(count);
    }
  
  }
}
