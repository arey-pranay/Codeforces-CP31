import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int t = 0;t<testcases; t++){
           int n = sc.nextInt();
           ArrayList<Integer> list = new ArrayList<>();
           list.add(sc.nextInt());
           for(int i =1;i<n;i++){
               int a = sc.nextInt();
               if(a < list.get(i-1)) list.add(a);
                list.add(a);
           }
           System.out.println(list.size());

            for(int i : list) System.out.print(i+" "); 
                       System.out.println();

        
        }
        return;
	}
}
