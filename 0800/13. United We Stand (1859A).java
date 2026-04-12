import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           int[] arr = new int[n];

           for(int i =0;i<n;i++){
               int a = sc.nextInt();
               arr[i] = a;
           }
           tryDividing(arr);
        }
        return;
	}
    public static void tryDividing(int[] arr){
        Arrays.sort(arr);
        int i = arr.length-1;
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        c.add(arr[i--]);
        while(i>=0 && arr[i]==c.get(0)) c.add(arr[i--]);
        for(int j=0;j<=i;j++) b.add(arr[j]);
       
        if(b.size()==0 || c.size()==0){
            System.out.println(-1);
            return;
        }
        System.out.print(b.size()+" "+c.size());
                System.out.println();

        for(int j : b) System.out.print(j+" ");
        System.out.println();
        for(int j : c) System.out.print(j+" ");
                System.out.println();

        return;
    }

}
