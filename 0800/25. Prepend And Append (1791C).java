import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
            sc.nextLine();
           String str = sc.nextLine();
           System.out.println(func(n, str));
        }
        return;
	}
    public static int func(int n, String str){
       int i =0;
       int j = n-1;
       while(i<=j){
           if(str.charAt(i)==str.charAt(j)){
               return j-i+1;
           }
           i++;
           j--;
       }
       return 0;
    }
}
