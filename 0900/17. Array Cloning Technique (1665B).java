import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0){
            HashMap<Integer,Integer> freq = new HashMap<>();
            int n = sc.nextInt();
            int max = 0;
            for(int i =0;i<n;i++){
                int curr = sc.nextInt();
                int cnt = freq.getOrDefault(curr,0)+1;
                freq.put(curr,cnt);
                max = Math.max(max,cnt);
            }
            int op = 0;
            while(max<n){
                op++; // clone
                int add = Math.min(max,n-max);
                op += add; // swap
                max += add;
            }
            System.out.println(op);
        }
    }
}
