import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();

        for(int t = 0;t<testcases; t++){
           int x = sc.nextInt();
           int k = sc.nextInt();
            if(x%k != 0){
                System.out.println(1);
                System.out.println(x);
            }
            else{
                System.out.println(2);
                System.out.println(x-1 + " " + 1);
            }
        }
        return;
	}
}
