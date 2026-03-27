import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
		public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt();
            if(func(n)) System.out.println("First");
            else System.out.println("Second");
        }
        return;
	}
    public static boolean func(int x){
        return (((x-1)%3 == 0) || ((x+1)%3 == 0));
    }
}
