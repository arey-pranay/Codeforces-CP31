import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        String print ="";
        for(int t = 0;t<testcases; t++){
           long n= sc.nextLong();
           long k= sc.nextLong();
           if(k==1) print = "YES";
           else if(k%2==0 && n%2!=0) print = "NO";
           else print = "YES";
           System.out.println(print);
        }
        return;
	}
}
