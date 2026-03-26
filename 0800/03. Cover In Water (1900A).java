import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech {
		public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();   
            System.out.println(func(x));
        }
        return;
	}
    public static int func(String str){
        int n = str.length();
        int ans = 0;
        int consec = 0;

         for(char c:str.toCharArray()){
            if(c == '#'){
                if(consec > 2) return 2;
                ans += consec;
                consec = 0;
            } else consec++;
        }
        if(consec > 2) return 2;
        return ans + consec;
    }
}
