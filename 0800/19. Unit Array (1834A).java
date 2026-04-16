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
           int n1 = 0;
           int n2 = 0;
           for(int i=0;i<n;i++) if(sc.nextInt()==1)n1++; else n2++;
           int count = 0;
           while(count <= n){
                if((n1-count >= n2+count) &&((n2+count)%2==0)){
                    System.out.println(count);
                    break;
                }
                if((n1+count >= n2-count) &&((n2-count)%2==0)){
                    System.out.println(count);
                    break;
                }
                count++;
           }
        }
        return;
	}
}
