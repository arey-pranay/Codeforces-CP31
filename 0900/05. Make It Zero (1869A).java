import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
            if(n%2 == 0){
                System.out.println(2);
                System.out.println(1+ " " + n);
                System.out.println(1+ " " + n);
            } else {
                System.out.println(4);
                System.out.println(1+ " " + (n-1));
                System.out.println(1+ " " + (n-1)); 
                System.out.println(2+ " " + n);
                System.out.println(2+ " " + n);
            }
        } 
    }
    
}
