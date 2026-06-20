import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextInt();
            long x = sc.nextInt();
            long sum = 0;
            long curr = 0;
            for(int i=0;i<n;i++){
              long temp = sc.nextInt();
                curr += (temp + x - 1) / x; 
                sum += temp;
            }
            long minValue = (sum + x - 1) / x; 
            System.out.println(minValue + " "+  curr);
        }
  }

}
