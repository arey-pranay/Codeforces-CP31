import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int total2 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) total2++;
            }

            // Case 1: odd number of 2s
            if (total2 % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            // Case 2: no 2s
            if (total2 == 0) {
                System.out.println(1);
                continue;
            }

            // Case 3: find smallest k
            int target = total2 / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == 2) count++;
                if (count == target) {
                    System.out.println(i + 1); // k is 1-based
                    break;
                }
            }
        }

        sc.close();
    }
}
