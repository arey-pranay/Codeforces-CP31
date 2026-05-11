import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            // hum min se max ke beech me saare numbers bna skte hai
            // smallest k numbers ka sum
            long min = k*(k+1)/2; 
            // biggest k numbers ka sum. which is same as sum of first n int - sum of first n-k numbers
            long max  = (n*(n+1)/2) - ((n-k)*(n-k+1)/2); 
            if(x>= min && x <= max)System.out.println("YES");
            else System.out.println("NO");
        } 
    }
    
    // backtrack approach, but stack overflow due to big numbers and their storage in hashset, too big size.
    public static boolean func(int n, int k, long x, HashSet<Integer> hs, int end){
        if(x<0) return false;
        if(k==0) return x==0;
        boolean flag = false;
        for(int i=end;i>0;i--){
            if(hs.contains(i)) continue;
            hs.add(i);
            flag = func(n,k-1,x-i,hs, i-1);
            if(flag) return true;
            hs.remove(i);
        }
        return false;
    }
}
