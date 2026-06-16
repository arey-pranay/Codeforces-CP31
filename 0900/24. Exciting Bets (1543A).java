import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println("0 0");
                continue;
            }

            long diff = Math.abs(a - b);
            long r = a % diff;

            long moves = Math.min(r, diff - r);
            System.out.println(diff + " " + moves);
        }
    }
}
