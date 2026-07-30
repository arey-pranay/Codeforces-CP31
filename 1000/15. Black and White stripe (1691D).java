import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();

            String s = sc.nextLine();

            int white = 0;

            // Count whites in first window
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W')
                    white++;
            }

            int ans = white;

            // Sliding window
            for (int j = k; j < n; j++) {
                if (s.charAt(j - k) == 'W')
                    white--;

                if (s.charAt(j) == 'W')
                    white++;

                ans = Math.min(ans, white);
            }

            System.out.println(ans);
        }
    }
}
