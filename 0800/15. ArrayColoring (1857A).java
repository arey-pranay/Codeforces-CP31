import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        //age sum even hai, to odd numbers even baar aayega
        //agr sum odd hai, to off number odd baar aayega

        //agr odd numbers of odd hai then not possible to divide
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
            int odd = 0;
           for(int i =0;i<n;i++){
               int a = sc.nextInt();
               if(a%2 != 0) odd++;
           }
           System.out.println(odd % 2 == 0 ? "YES" : "NO");
        }
        return;
	}
}
