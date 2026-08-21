import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      int n = sc.nextInt();  
      int m = sc.nextInt();
      int total = m*n;
      int min = Integer.MAX_VALUE;
      int sum = 0;
      boolean subtract = false;
      for(int i=0;i<total;i++){
        int curr = sc.nextInt();
        min = Math.min(Math.abs(curr), min);
        if(curr < 0) subtract = !subtract;
        sum += Math.abs(curr);
      }
      if(subtract) sum -= 2*min;
      System.out.println(sum);
      
    }
  }
}
