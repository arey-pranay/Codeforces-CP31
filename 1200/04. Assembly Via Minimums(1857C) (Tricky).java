import java.util.*; 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt(); int sz = n*(n-1)/2;
      long[] b = new long[sz];
      for(int i =0;i<sz;i++) b[i]=sc.nextLong();
      Arrays.sort(b);
      int j=0; int skip = n-1;
      for(int i=0;i<n-1;i++){
          System.out.print(b[j]+" ");
          j += skip; // the next "skip" numbers are not useful because they are the determined by the small number we just already put, so to get the next useful number after "skip" numbers
          skip--;  // the next number will make 1 less pair than before. so we will skip 1 less number from b
      }
      System.out.println(1000000000+" ");
    }
  }
}
