import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
              arr[i] =sc.nextInt();
            }
            System.out.println(func(arr));
        }
    }
    public static int func(int[] arr){
        int n = arr.length;
        int start = 0;
        while(start<n && arr[start] == 0) start++; 
        if(start == n) return 0;
        int end = n-1;
        while(arr[end] == 0  &&  end>=start) end--;
        while(start < end){if(arr[start++] == 0)return 2;}
        return 1;
       
    }
}
