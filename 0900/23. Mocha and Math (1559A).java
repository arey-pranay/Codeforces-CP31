import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) { 
            int n = sc.nextInt();
            int ans = sc.nextInt();
            for(int i=1;i<n;i++) ans &= sc.nextInt();
            System.out.println(ans);
        }
    }
}
