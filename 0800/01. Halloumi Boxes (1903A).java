import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++)arr[j] = sc.nextInt();
            if(k<=1 && !isSorted(arr) && n>1) System.out.println("NO");
            else System.out.println("YES");
        }
	}
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++) if(arr[i] < arr[i-1]) return false;
        return true;
    }
}
