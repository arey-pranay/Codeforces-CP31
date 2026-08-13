import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
      for(int i =0;i<n;i++){ arr[i]=  sc.nextInt(); pq.add(new int[]{arr[i],i});}
      int sign = 1;
      int index = 1;
      long ans = 0;
      while(!pq.isEmpty()){
        int[] curr = pq.poll();
        arr[curr[1]] = sign*index;
        ans += curr[0]*2L*Math.abs(arr[curr[1]]);
        if(sign==-1) index++;
        sign *= -1;
      }
      System.out.println(ans);
      System.out.print(0+" ");
      for(int num : arr) System.out.print(num+" ");
      System.out.println();
    }
  }
}
