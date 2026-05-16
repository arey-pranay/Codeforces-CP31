import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();

            long cnt = 1;

            for (long p = 2; n % p == 0; p++) {
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}
