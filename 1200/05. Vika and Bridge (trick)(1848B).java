import java.util.*; 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] last = new int[k+1]; // track the most recent occurence of each color to calculate gap
      // store the 2 largest gaps of each color, because we can re-paint 1 plan which will divide the distance into half. so ans for this color will be
      // max(m1/2, m2)
      int[] m1Arr = new int[k+1]; //used to store the max gap
      int[] m2Arr = new int[k+1]; //used to store the 2nd max gap
      for(int i =1;i<=n;i++) {
        int color = sc.nextInt();
        int prev = last[color];
        int gap = i-prev-1;    // the length of jump between previous occurence of this color to this occurence
        int m1 = m1Arr[color];
        int m2 = m2Arr[color];

        if(gap > m1){m2Arr[color] = m1; m1Arr[color] = gap;}  //if the current gap is greater than the existing max1 we will update the max1 and max2
        else if(gap > m2) m2Arr[color] = gap; //if current gap is greater that max2 we will update that

        last[color] = i;  //to track when that color occured most recently
      }
//1 2 3 4 5 6 -> nice test case.


       // the calculation for accounting for the jump to reach the other side of the bridge from the last occurence of every color
      for(int i=1;i<=k;i++){
        int m1 = m1Arr[i];
        int m2 = m2Arr[i];
        int gap = n-last[i];
        if(gap > m1){m2Arr[i] = m1; m1Arr[i] = gap;}
        else if(gap > m2) m2Arr[i] = gap;
      }
      int ans = n;

      // minimum possible maximum number of planks she will have to cross in one step, if she can repaint one (or zero) plank a different color while crossing the bridge.
      for(int i=1;i<=k;i++) ans = Math.min(ans, Math.max(m1Arr[i]/2 , m2Arr[i]));

      System.out.println(ans);
    }
  }
}
