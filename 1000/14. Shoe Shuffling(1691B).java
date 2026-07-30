import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            ArrayList<Integer> point = new ArrayList<>();

            boolean done = false;

            if (n == 1)
                done = true;

            point.add(1);

            int prev = sc.nextInt();

            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();
                int target = point.get(point.size() - 1);

                if (curr != prev && i - target == 0)
                    done = true;

                if (curr != prev) {
                    prev = curr;
                    point.add(i + 1);
                }
            }

            if (point.get(point.size() - 1) == n)
                done = true;

            if (!done) {
                for (int i = 0; i < point.size() - 1; i++) {
                    func(point.get(i), point.get(i + 1) - 1);
                }
                func(point.get(point.size() - 1), n);
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }

    public static void func(int s, int e) {
        System.out.print(e + " ");
        for (int j = s; j < e; j++) {
            System.out.print(j + " ");
        }
    }
}
