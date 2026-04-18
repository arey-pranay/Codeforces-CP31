import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           int max = 0;
           int count = 0;
           for(int i=0;i<n;i++) if(sc.nextInt() == 0) count++; else{
               max = Math.max(max,count);
               count = 0;
           }
           System.out.println(Math.max(max,count));
        }
        return;
	}
}
