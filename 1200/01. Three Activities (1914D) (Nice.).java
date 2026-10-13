import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int t = sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
         int[] arr1 = new int[n];
         int[] arr2 = new int[n];
         int[] arr3 = new int[n];
         PriorityQueue<Integer> minHeap1 = new PriorityQueue<>((a,b) -> arr1[a]-arr1[b]);
         PriorityQueue<Integer> minHeap2 = new PriorityQueue<>((a,b) -> arr2[a]-arr2[b]);
         PriorityQueue<Integer> minHeap3 = new PriorityQueue<>((a,b) -> arr3[a]-arr3[b]);
         takeInput(n,arr1,minHeap1);
         takeInput(n,arr2,minHeap2);
         takeInput(n,arr3,minHeap3);
         int ans = 0;
          for(int m1 : minHeap1){
            for(int m2 : minHeap2){
              for(int m3: minHeap3){
                if(m1==m2 || m2==m3 || m3==m1) continue;
                ans = Math.max(ans,arr1[m1]+arr2[m2]+arr3[m3]);
              }
            }
          }
          System.out.println(ans);
    }
  }
  public static void takeInput(int n, int arr[], PriorityQueue<Integer> minHeap){
    for(int i = 0;i<n;i++){
        int x = sc.nextInt();
        arr[i] = x; 
        minHeap.add(i);
        if(minHeap.size()>3) minHeap.poll();
     }
  }
}
    

