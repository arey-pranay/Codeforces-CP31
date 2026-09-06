import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      
    
      long arr[][] = new long[n][2];
      
      for(int i =0;i<n;i++){
          arr[i][0] = sc.nextLong();
          arr[i][1] = sc.nextLong();
      }
     
      long direct = calculate(arr, a, b);
      if(k==0) {System.out.println(direct);continue;}
      
      // I think we can try finding the nearest major city from src to dest
      long nearA = Long.MAX_VALUE, nearB= Long.MAX_VALUE;          
      for(int i =0;i<k;i++){
         nearA = Math.min(nearA,calculate(arr,a,i));
         nearB = Math.min(nearB,calculate(arr,b,i));
      }

      
      System.out.println(Math.min(direct, (nearA+nearB)));
    }
  }
  public static long calculate(long[][] arr, int src, int dest){
      return Math.abs(arr[src][0] - arr[dest][0]) + Math.abs(arr[src][1] - arr[dest][1]);
  }
    
}
