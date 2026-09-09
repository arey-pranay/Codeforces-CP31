// 5
// 6
// 9 6 8 4 5 2
// 4 1 5 6 3 1

// 2 4 5 6 8 9
// 1 1 3 4 5 6

// 9 (6,8)
// 6 5

// 8 (6,9)
// 6 5


// no of way 6  =  2 
// no of way 5 = 2(no of way 6 have )+ 1(6 wala) = 3; //no between 5 and 6
// no of way 4  = 3 + 1 = 4
// no of way 3  = 4+1    = 5
// 2*no of way 1 =   5+1   = 6
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long[] a = new long[n];
      long[] b = new long[n];
      for(int i = 0;i<n;i++) a[i] = sc.nextLong();
      for(int i = 0;i<n;i++) b[i] = sc.nextLong();
      Arrays.sort(a);
      Arrays.sort(b);
      long ans = 1;
      int sub = 0;
      for(int i=n-1;i>=0;i--){
        long curr = b[i];
        int ub = n - upperBound(a,curr);
        int ways = ub-sub;
        if(ways<=0){ans=0;break;}
        ans  = (ans*ways)%1_000_000_007L;
        sub++;
      }
      System.out.println(ans);
    }
  }

  public static int upperBound(long[] arr, long target){
    int s = 0;
    int e = arr.length-1;
    int ub = e+1;

    while(s<=e){
      int m = s + (e-s)/2;
      if(arr[m] > target) //left me aur scope hai
      {ub = m; e=m-1;}
      else{s = m+1;}
    }

    return ub;
  }
}
