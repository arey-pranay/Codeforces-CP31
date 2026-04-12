import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);  
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           double c = sc.nextInt();
           a += Math.ceil(c/2);
            b += Math.floor(c/2);
            if(b>=a) System.out.println("Second");
            else System.out.println("First");
        }
        return;
	}
	}
  
