import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int a = -1;
            for(int j=0;j<n;j++){
                a = sc.nextInt();
                if(a == k){
                    k=-1;
                    System.out.println("YES");
                }
            }
            if(k!=-1){
                System.out.println("NO");
            }
        }
        return;
	}
 
}
