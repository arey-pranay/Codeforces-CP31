import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int testcases = sc.nextInt();
 
        while (testcases-- > 0) {
            int n = sc.nextInt();
 
            int[] arr = new int[n];
            int[] indexOf = new int[n + 1];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                indexOf[arr[i]] = i;
            }
 
            int start = 0;
            int end = n - 1;
            int max = n;
            boolean found = false;
 
            while (end >= start && max > 0) {
                if (indexOf[max] == start) {
                    start++;
                    max--;
                } else if (indexOf[max] == end) {
                    end--;
                    max--;
                } else {
                    found = true;
                    System.out.println("YES");
                    // 1-based indices
                    System.out.println((start + 1) + " " + (indexOf[max] + 1) + " " + (end + 1));
                    break;
                }
            }
 
            if (!found) {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}
