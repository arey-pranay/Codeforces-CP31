import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        
        Scanner sc  = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int t = 0;t<testcases; t++){
            int arr[] = new int[26];
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for(char c : s.toCharArray()) arr[c-'a']++;
            int odds = 0;
            for(int i : arr) if(i%2==1) odds++;
            // agr saare even hai then answer yes hai
            // we need to remove all odd except maybe 1.
            if (odds < 2 || odds-1 <= k){System.out.println("YES");continue;}
            System.out.println("NO");
        } 
    }
}
// YES
// NO
// YES
// YES
// YES
// YES
// NO
// NO
// YES
// YES
// YES
// YES
// NO
// YES
