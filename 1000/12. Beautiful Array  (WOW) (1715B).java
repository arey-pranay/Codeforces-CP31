import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    while(tc-->0){
        int n = sc.nextInt();// size of array
        long k = sc.nextLong(); // divisor
        long b = sc.nextLong(); // beauty of array (for int i=0;i<n;i++) b+= arr[i]/k
        long s = sc.nextLong(); // sum of array (for int i=0;i<n;i++) s+= arr[i]
        long[] arr = new long[n];
        if(b > s/k){ System.out.println(-1); continue; }
        arr[0] = b*k;
        long diff = s- arr[0];
        int i=0;
        block0:{
          while(diff>0){
            if(i==n){System.out.println(-1); break block0;}
            long add = Math.min(diff,k-1); 
            arr[i++] += add;
            diff -= add;
          }
          for(long num : arr){
              System.out.print(num + " ");
           }
           System.out.println();
        }
    }
  }
}
