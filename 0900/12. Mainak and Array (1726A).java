import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
                  min = Math.min(arr[i],min);
                  max = Math.max(arr[i],max);
            }
           //case 1 if min and max are adjecent    
           int min_pos = get(min,arr);
           int max_pos = get(max,arr);
           System.out.println("min_pos = "+min_pos);
             System.out.println("max_pos = "+max_pos);
           int diff =min_pos- max_pos; 
           if((diff==1)|| min_pos==0 || max_pos==n-1) System.out.println(max-min);
           else{
               int ans = Math.max(max-arr[0],arr[n-1]-min);
                ans = Math.max(arr[n-1]-arr[0],ans);
                for(int i=1;i<n;i++) ans = Math.max(ans,arr[i-1]-arr[i]);
               System.out.println(ans);
           }
           
        }
            
    }
    public static int get(int target, int arr[]) {
       for(int i =0;i<arr.length;i++){
           if(arr[i]==target) return i;
       }
       return -1;
    }
}
