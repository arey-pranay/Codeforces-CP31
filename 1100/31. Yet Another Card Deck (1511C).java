import java.util.*;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) arr[i] = sc.nextInt();
      for(int i=0;i<q;i++){
        int x = sc.nextInt();
        for(int j=0;j<n;j++){
          if(arr[j]==x){
            System.out.print(j+1+" ");
            for(int k=j;k>0;k--) arr[k] = arr[k-1];
            arr[0] = x;
            break;
          }
        }
      }
      System.out.println();
    }
}
