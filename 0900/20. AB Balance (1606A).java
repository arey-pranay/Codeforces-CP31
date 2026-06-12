import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                char[] arr = s.toCharArray();
                arr[0] = arr[arr.length - 1];
                s = new String(arr);
            }

            System.out.println(s);
        }
    }
}
