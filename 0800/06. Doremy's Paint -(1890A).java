import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        for(int i = 0;i<testcases; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++) arr[j] = sc.nextInt();
            if(func(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
        return;
	}
        
    public static boolean func(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.size()>2) return false;
        }
        for(int value : hm.values()){
            if(value == n/2 || value == n) return true;
        }
        return false;
    }
}
