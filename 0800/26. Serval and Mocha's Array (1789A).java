import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            boolean hasOne = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) hasOne = true;
            }

            if (hasOne) {
                System.out.println("Yes");
                continue;
            }

            boolean ok = false;

            for (int i = 0; i < n && !ok; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) <= 2) {
                        ok = true;
                        break;
                    }
                }
            }

            System.out.println(ok ? "Yes" : "No");
        }

        sc.close();
    }
}
