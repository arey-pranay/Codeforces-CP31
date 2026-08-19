import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a==1 && b==1){System.out.println(2);continue;}
      int ans = Integer.MAX_VALUE;
      for(int i=0;i<30;i++){
        int a_ = a;
        int b_= b+i;
        int count=i;
        if(b_==1){b_++; count++;}
        while(a_!=0){
          count++;
          a_ /= b_;
        }
        ans = Math.min(ans,count);
      }
      System.out.println(ans);
    }
  }
}
