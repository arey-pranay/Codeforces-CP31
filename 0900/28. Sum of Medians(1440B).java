import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
          int n = sc.nextInt();
          int k = sc.nextInt();
          int[] arr = new int[n*k];
          for(int i=0;i<n*k;i++)arr[i]=sc.nextInt();
          long sum = 0;
          
          int pos = ((n - 1) / 2) * k;
          int step = n/2+ 1;
          for(int i=0;i<k;i++){
            sum+=arr[pos];
            pos += step;
          }
          
          System.out.println(sum);
        }
  }

}

