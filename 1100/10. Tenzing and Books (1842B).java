 import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int x = sc.nextInt();
      int knowledge = 0;
      for(int i=0;i<3;i++){
        boolean ignore = false;
        for(int j=0;j<n;j++){
         int book = sc.nextInt();
         if(ignore) continue;
         
         if((x | book )!= x) // taking this number will give an unnecessary bit, that we can never remove because we are just allowed to do the OR operation. 
           ignore = true; // So we will ignore this and everything after this
         else knowledge |= book; // this means that we are gaining knowledge without any unnecessary bit, so let's take it. Because no loss, maybe profit.
        }
      }
      if(knowledge == x)System.out.println("YES");
      else System.out.println("NO");
    }
  }
}

