import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0;i<n;i++) arr[i] = sc.nextLong();
            Arrays.sort(arr);
            long ans = b;
            for(long i : arr){
                ans += Math.min(i,a-1);
                b=1;
            }
           
           
            System.out.println(ans);
        } 
        return;
    }   
}
