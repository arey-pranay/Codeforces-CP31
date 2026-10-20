  import java.util.*;
  public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int q = sc.nextInt();
      long pref [] = new long[n];
      long norm[] = new long [n];
      long min = Integer.MAX_VALUE;
      long max = 0;
      for(int i =0;i<n;i++){
         long curr = sc.nextLong();
         if(i==0) pref[i] = curr;
         else pref[i] = pref[i-1]+curr;
         max = Math.max(max,curr);
         min = Math.min(min,curr);
         norm[i] = max;
      }
      long ans[] = new long[q];
      for(int i=0;i<q;i++){
        long curr = sc.nextInt();
        if(curr>=max) ans[i] = pref[n-1];
        else if(curr<min) ans[i] = 0;
        else ans[i] = upperBound(curr,norm,pref);
      }
      for(long i :ans) System.out.print(i+" ");
      System.out.println();
    }
  }
  public static long upperBound(long target,long[] norm ,long[] pref){
    int start = 0;
    int end = norm.length-1;
    while(start<end){
      int mid = (start+end)/2;
      if(norm[mid]<=target)start = mid+1;
      if(norm[mid]>target)end = mid;
    }
    return start==0 ? 0: pref[start-1];
  } 
}
