import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                
                int target = arr[n - 1]; 
                int i = n - 2;
                int good = 1; // Tracks the count of elements matching target from the right
                int ans = 0;  // Tracks the number of copy operations
                
                while (i >= 0) {
                    if (arr[i] == target) {
                        good++;
                        i--; // Move to the next element on the left
                    } else {
                        ans++;       // Perform a copy operation
                        i -= good;   // Skip the elements that will be overwritten
                        good *= 2;   // The size of our matching suffix doubles
                    }
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
