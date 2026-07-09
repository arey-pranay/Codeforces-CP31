import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr1 = new int[2 * n + 1];
            int[] arr2 = new int[2 * n + 1];

            int prev = -1;
            int streak = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == prev)streak++; else streak = 1;
                prev = x;
                arr1[x] = Math.max(arr1[x], streak);
            }

            prev = -1;
            streak = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == prev) streak++; else streak = 1;
                prev = x;
                arr2[x] = Math.max(arr2[x], streak);
            }

            int ans = 0;
            for (int i = 1; i <= 2 * n; i++) ans = Math.max(ans, arr1[i] + arr2[i]);

            System.out.println(ans);
        }
    }
}
