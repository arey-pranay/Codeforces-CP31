import java.util.*;
import java.lang.*;
import java.io.*;



class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        for(int i = 0;i<testcases; i++){
            sc.nextInt(); sc.nextInt(); sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(func(a,b));
        }
        return;
	}
        
    public static int func(String curr,String target){
        int m = target.length();
        StringBuilder str = new StringBuilder(curr);
        int n = curr.length();
        int i = 0;
        if(str.indexOf(target) != -1) return i;  
        str = str.append(str);
        i++;
        if(str.indexOf(target) != -1) return i;  
  
        while(n<2*m+1){
           str = str.append(str);
            n = str.length();
           i++;
           if(str.indexOf(target) != -1) return i;    
        }
        return -1;
    }
}
