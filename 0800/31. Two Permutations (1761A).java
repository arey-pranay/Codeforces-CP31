import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n==a && a==b){System.out.println("YES");continue;}
            // n=1 a=1 b=1. ye alg se handle
            // kya kr rha hai ?
            String ans = n-a-b > 1 ? "YES" : "NO" ;
            System.out.println(ans);
        } 
    }
}
