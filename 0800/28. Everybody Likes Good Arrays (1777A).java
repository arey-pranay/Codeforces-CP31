import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++) arr[i] = sc.nextInt();
           int ans = 0;
           int curr = arr[0];
           int index = 1;
           int streak = 1;
           while(index < n){
               if(parity(curr) == parity(arr[index])) streak++; 
               else {
                   ans += streak-1;
                   curr = arr[index];
                   streak = 1;
               }
                index++;
           }
           ans += streak-1;
           System.out.println(ans);
       } 
    }
    public static int parity(int n){
        return n%2;
      
    }
}
