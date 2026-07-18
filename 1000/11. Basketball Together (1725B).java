import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int D = sc.nextInt();
      int arr[] = new int[n];
      int ans = 0;
      for(int i=0;i<n;i++) arr[i] = sc.nextInt();
      Arrays.sort(arr);
      int l = 0;
      int r = n-1;
      while(l<=r){
            int quot = D/arr[r];
            if(l+ quot > r) break;
            l+=quot;
            r--;
            ans++;
        }
        System.out.println(ans);
    } 
}
