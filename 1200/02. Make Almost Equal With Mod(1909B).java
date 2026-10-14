import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      boolean oddFound = false;
      boolean evenFound = false;
      int n = sc.nextInt();
      long[] arr = new long[n];
      
      for(int i=0;i<n;i++){
        long x = sc.nextLong();
        if(x % 2 == 0) evenFound = true;
        else oddFound = true;
        arr[i] = x;
      }
      if(oddFound && evenFound){ System.out.println(2); continue;}

      long curr = 2;
      boolean ansFound = false;
      while(!ansFound){
        curr *= 2;
        Set<Long> set = new HashSet<>();
        block : {
          for(long num : arr){
            set.add(num%curr);
            if(set.size() > 2) break block;
          }
          if(set.size() == 2) ansFound = true;
        }
        
      }

      System.out.println(curr);
    }
    
  }
}
