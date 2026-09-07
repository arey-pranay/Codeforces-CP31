import java.util.*;
 public class Main{   
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
     while(t-->0){
       int n = sc.nextInt();
       int k = sc.nextInt();
       
       long arr[] = new long[n];       
       for(int i =0;i<n;i++) arr[i] = sc.nextLong();
       Arrays.sort(arr);
       
       long pre[] = new long[n+1];
       for(int i =0;i<n;i++) pre[i+1] = pre[i]+arr[i];
       
       long ans = 0;
       for(int i=0;i<=k;i++){  // k=4 can be used as -> 0,4    1,3      2,2     3,1     4,0
         int left = i*2;
         int right = n-(k-i);
         long sum = pre[right] - pre[left];
         ans = Math.max(ans,sum);
       }
        System.out.println(ans);
     }
   } 
} 
// k = 4

// 1 2 3 4 5 6

//   k=3, m=4

// 5 2
// 2 5 1 10 6

// 1 2 5 6 10

// 1 3 8 14 24
  

// 6 1
// 10 11 12 13 15 22
