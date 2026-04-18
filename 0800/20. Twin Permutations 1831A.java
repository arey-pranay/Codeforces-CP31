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
           for(int i=0;i<n;i++) arr[i]= n+1-sc.nextInt();
           for(int i: arr)System.out.print(i+" ");
           System.out.println();
       
        }
        return;
	}
}
