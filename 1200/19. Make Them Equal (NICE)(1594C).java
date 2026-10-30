import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      char c = sc.nextLine().charAt(1);
      String s = sc.nextLine();
      if(s.replace(String.valueOf(c),"").isEmpty()){System.out.println(0); continue;}
      int common = -1; // a number who can target all mismatches
       for(int x=2; x<=n && common == -1 ; x++){
         boolean allSafe = true;
         for(int i=x;i<=n;i+=x){ // the number cannot target its own table
           if(s.charAt(i-1) != c){allSafe=false;break;}
         }
         if(allSafe) common = x;
       }
      if(common != -1){System.out.println(1); System.out.println(common);}
      else{System.out.println(2); System.out.println((n-1) +" "+(n));}
    }
  }
}


// 3 c
// ucg
