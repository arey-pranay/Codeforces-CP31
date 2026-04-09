import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt(); 
            int sum = 0;
            for(int j=0;j<n-1;j++){
                int a = sc.nextInt();
                sum+= a;
            }
            System.out.println(-sum);
        }
        return;
	}
}
