import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int min = Integer.MAX_VALUE;
           int n = sc.nextInt();
           int prev = sc.nextInt();
           for(int i =1;i<n;i++){
              int curr = sc.nextInt(); 
              int diff = curr-prev;
              min = Math.min(min,diff);
              prev = curr;
           }
           if(min<0) System.out.println(0);
           else System.out.println((min/2)+1);
        }
        return;
	}
}
