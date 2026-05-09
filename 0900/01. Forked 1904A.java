import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int kx = sc.nextInt();
            int ky = sc.nextInt();
            int qx = sc.nextInt();
            int qy = sc.nextInt(); 
            int count = 0;
            int A = 0;
            int mul1 =1;
            int mul2 =1;
            int[] arr = new int[]{a,b};
            HashSet<String> hs = new HashSet<>();
            for(int i=0;i<8;i++){
                int x =  kx + (mul2 * arr[A]);
                int y =  ky + (mul1 * arr[A^1]);
                
                if(i!=3) A = A^1;
                
                mul1 = -mul1;
                if(i%2 == 1) mul2 = -mul2;
                
                if( (Math.abs(qx-x) == a && Math.abs(qy-y) == b) || (Math.abs(qx-x) == b && Math.abs(qy-y) == a) ) hs.add(x+","+y);
            }
            System.out.println(hs.size());
        } 
    }
}
