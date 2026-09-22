import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
          int n = sc.nextInt();
          long c = sc.nextLong();
          PriorityQueue<Long> pq = new PriorityQueue<>();
          for(int i=1;i<=n;i++) pq.add((i)+sc.nextLong());
          long ans = 0;
          long curr = pq.poll();
          while(c>=curr){
            ans++;
            c-=curr;
           if(pq.isEmpty()) break;
            curr = pq.poll();
          }
          System.out.println(ans);
      }
   }
}

  
