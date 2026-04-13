import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
            solve(n, k, x);
        }
    }
 
    static void solve(int n, int k, int x) {
        // Case 1: 1 is available — fill with all 1s
        if (x != 1) {
            System.out.println("YES");
            System.out.println(n);
            for (int i = 0; i < n; i++) System.out.print("1 ");
            System.out.println();
            return;
        }
 
        // x == 1 from here, so we can only use 2..k
 
        // Case 2: k == 1, nothing available
        if (k == 1) {
            System.out.println("NO");
            return;
        }
 
        // Case 3: n is even — fill with 2s
        if (n % 2 == 0) {
            System.out.println("YES");
            System.out.println(n / 2);
            for (int i = 0; i < n / 2; i++) System.out.print("2 ");
            System.out.println();
            return;
        }
 
        // Case 4: n is odd — need one odd number from 2..k (that's not 1)
        // Use one 3 (if k >= 3), then fill rest with 2s
        // n - 3 must be >= 0 and even, which it is since n is odd
        if (k >= 3) {
            int rem = n - 3; // rem is even, >= 0
            int count = 1 + rem / 2;
            System.out.println("YES");
            System.out.println(count);
            System.out.print("3 ");
            for (int i = 0; i < rem / 2; i++) System.out.print("2 ");
            System.out.println();
            return;
        }
 
        // k == 2, x == 1, n is odd — impossible
        System.out.println("NO");
    }
}
