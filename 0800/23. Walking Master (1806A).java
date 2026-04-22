import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
       Scanner sc  = new Scanner(System.in);
      
        int testcases = sc.nextInt();

         for(int t = 0;t<testcases; t++){
           int x1 = sc.nextInt();
           int y1 = sc.nextInt();
           int x2 = sc.nextInt();
           int y2 = sc.nextInt();
           System.out.println(func(y2-y1,x2-x1));
        }
        return;
	}
    public static int func(int diffY, int diffX){
       if(diffY < 0) return -1;
       if(diffX > diffY) return -1;
       if(diffY == diffX)return diffY;
       else return diffY + diffY - diffX;
    }
}
