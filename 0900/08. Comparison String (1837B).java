import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(long t = 0;t<testcases; t++){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count = 2;
            int longest = 2;
            char[] arr = s.toCharArray();
            for(int i = 1;i<n; i++){
                if(arr[i]==arr[i-1]){
                    count++;
                    longest = Math.max(longest,count);
                } else count = 2;
            }
            System.out.println(Math.max(longest,count));
        } 
    }   
}
// k = 3
// 1 3 5 12 12 17 17 20

// c=3

// 8 3 1 4 5 10 7 3

// 1 2 3 4 6 7 8 9 11 12 13 14 15

// 1 3 3 4 5 7 8 10

// c = 1

