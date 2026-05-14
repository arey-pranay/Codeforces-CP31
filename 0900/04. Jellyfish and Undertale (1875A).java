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
            long ans = b;
            for(int i=0;i<n;i++) ans += Math.min(sc.nextLong(),a-1);
            System.out.println(ans);
        } 
        return;
    }
    
}

