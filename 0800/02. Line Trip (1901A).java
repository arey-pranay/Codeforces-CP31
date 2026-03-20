import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++)arr[j] = sc.nextInt();            
            System.out.println(func(arr,x, n));
        }
	}
    public static int func(int[] arr, int x, int n){
        int ans = Math.max(arr[0],2*(x-arr[n-1]));
        for(int i=1;i<n;i++) ans = Math.max(arr[i]-arr[i-1],ans);
        return ans;
    }
   
}
