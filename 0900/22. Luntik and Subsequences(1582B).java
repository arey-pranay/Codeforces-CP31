import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) { 
            int n = sc.nextInt();
            int ones=0, zeroes = 0;
            for(int i=0;i<n;i++){int curr = sc.nextInt(); if(curr == 1) ones++; else if (curr==0) zeroes++;}
            long ans = ones* (long)Math.pow(2,zeroes);
            System.out.println(ans);
        }
    }
}
