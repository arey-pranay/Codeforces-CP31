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
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=1;i<n-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    flag = true;
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    //swap kr yahan pr
                }
            }
        }
        return isSorted(arr);        
    }
    public static boolean isSorted(int arr[]){
        int n = arr.length;
        for(int i =1;i<n;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    
    }
}
            
