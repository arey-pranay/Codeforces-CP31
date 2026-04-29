import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           int ans = 0;
           while(n>10){
               n /= 10;
               ans += 9;
           }
           ans+=n;
           System.out.println(ans);
       } 
    }
}
