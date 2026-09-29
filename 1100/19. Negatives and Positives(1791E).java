import java.util.*;
public class Main{
  
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long[] arr = new long[n];
      for(int i = 0;i<n;i++){
          arr[i] = sc.nextLong();
      }
      Arrays.sort(arr);
      int i = 0;
      int j =0;
      long sum = 0;
      while( j<n && arr[j]<0) j++;
      int totalNeg = j;
      while(i<n) sum += Math.abs(arr[i++]);
      if(j%2!=0){
         long minNeg = arr[j-1];
         long minPos = j==n ? Long.MAX_VALUE : arr[j];
         sum -= 2*Math.min(Math.abs(minNeg),minPos);
      }
      System.out.println(sum);
    }
  }
}
