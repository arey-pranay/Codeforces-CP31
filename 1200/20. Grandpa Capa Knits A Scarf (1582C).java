import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int t  = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      sc.nextLine();
      String s = sc.nextLine();
      int i=0, j=n-1;
      while(i<j &&(s.charAt(i)==s.charAt(j))){i++;j--;}
      // remove i or remove j
      int a = removeOcc(s,s.charAt(i),i,j), b = removeOcc(s,s.charAt(j),i,j);
      if(a != -1 && b != -1) System.out.println(Math.min(a,b));
      else System.out.println(a==-1 ? b : a);
    }
  }
  public static int removeOcc(String s, char toRemove,int i ,int j){
    int del = 0;
    while(i<j){
      if(s.charAt(i)==s.charAt(j)){ i++; j--;}
      else if(s.charAt(i) == toRemove) {i++; del++;}
      else if(s.charAt(j) == toRemove) {j--; del++;}  
      else return -1;
    }
    return del;
  }
}
