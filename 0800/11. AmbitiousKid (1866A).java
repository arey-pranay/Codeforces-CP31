import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n; i++){
           int a = sc.nextInt();
           min = Math.min(min, Math.abs(a));
        }
        System.out.println(min);
        return;
	}
}
