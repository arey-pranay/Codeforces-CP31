//create an array to store when was every index last updated. (in which iteration)
// then to get the old value         long old = lastChanged[c] < reset ? swapValue : arr[c];




import java.util.*; 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    long sum = 0;
    long arr[] = new long[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextLong();
        sum+=arr[i];
    }
    long swapValue = 0;
    int reset = 0;
    int[] lastChanged = new int[n];
    for(int i =1;i<=q;i++){
      if(sc.nextInt()==1){ //y
        int c = sc.nextInt()-1;
        long x = sc.nextLong();
        long old = lastChanged[c] < reset ? swapValue : arr[c];
        sum= sum-old+x;
        arr[c] = x;
        lastChanged[c] = i;
     }else {
        long x = sc.nextLong();
        sum = x*n;
        swapValue = x;
        reset = i;
      }
      System.out.println(sum);
    }
  }
}
