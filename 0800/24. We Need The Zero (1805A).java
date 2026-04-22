import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           int xor = 0;
           for(int i =0;i<n;i++){
              xor ^= sc.nextInt();
           }
           System.out.println(func(n, xor));
        }
        return;
	}
    public static int func(int n, int xor){
        if(n%2 == 0){
            if(xor  == 0) return 5;
            else return -1;
        } else {
            return xor;
        }
    }
}
