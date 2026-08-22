import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
       int n = sc.nextInt();
       sc.nextLine();
       String s = sc.nextLine();
       int ans = 0;
       int balance = 0;
        for(int i=0;i<n;i++){
          if(s.charAt(i)=='(') balance++;
          else balance--;
          if(balance < 0){ans++; balance=0;}
        }
       System.out.println(ans);
  }
}
}
