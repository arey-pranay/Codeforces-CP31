// Very important Observations        

//   4            100
//   8           1000
//   12          1100
//   16         10000
//   20         10100
//   24         11000+
//   28         11100
//   32        100000
//   => 4 ki table me last ke 2 bits are always 0
//   and since 4 = 2^2
//   therefore we can also maybe say that => 8 ki table me last ke 3 bits are always 0, etc
//   2 ki power x se divisible hone ke liye, number ke last x bits 0 hoge

//   mtlb number of trailing zeroes = x

  
  
//   ek baar koi number 2^x se divide hogya, to update hone ke baad wo 2^y (y>=x) se divide nhi ho skta


//   agr pehle 4 se divide krdiya, to wo already 8 wale potential candidates khtm krdega, now 8 is of no use in this.
//     we need to process queries only in decreasing order.
//       if(x > minX) continue;
  

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int q = sc.nextInt();
      int arr[] = new int[n];
      int query[] = new int[q];
      int minQuery = 31;
      for(int i =0;i<n;i++) arr[i] = sc.nextInt();
      int m =0;
      for(int i =0;i<q;i++){int x = sc.nextInt(); if(x < minQuery){ query[m++] = x; minQuery = Math.min(minQuery,x); } }
      
      for(int i=0;i<m;i++){
        int x = query[i];
        for(int j=0;j<n;j++){
          int number= arr[j];
          int zeroes = Integer.numberOfTrailingZeros(number);
          if(zeroes>=x) arr[j] += (1 << (x-1));
        }
      }
      for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
      System.out.println();
   }
 }
}
