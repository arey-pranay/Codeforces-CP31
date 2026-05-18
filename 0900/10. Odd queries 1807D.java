import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long[] pre = new long[n];
            pre[0] = arr[0];
            for(int i=1;i<n;i++) pre[i] = pre[i-1] + arr[i];

            for(int i =0;i<q;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                if(func(arr,l-1,r-1,k,pre)) System.out.println("Yes");
                else System.out.println("No");
            }
           
        }
            
    }
    public static boolean func(int arr[],int l,int r ,int k, long[] pre) {
        long lsum = l==0 ? 0 : pre[l-1];
        long rsum = pre[r];
        
        long ans = ( pre[arr.length-1] - (rsum-lsum) + (k * (r-l+1)));
        return ans % 2 == 0 ? false : true;
    }
}   
