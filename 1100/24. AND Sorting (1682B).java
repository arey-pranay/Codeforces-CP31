import java.util.*;
public class Main{
  public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n= sc.nextInt();
        int ans = -1;
        for(int i=0;i<n;i++){
          int x = sc.nextInt();
          if(i!=x) ans &= x;
        }
        System.out.println(ans);
    }
  }
}
  

// quot = 1000 => 1001
// quot = 500  => 1002
// quot = 333  => 1002


// 1 se 9
  
// 1000 se 2000

//   x>1000
