import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

      
        while (t-- > 0) {
            int n = sc.nextInt();//6
            int R = sc.nextInt();//5
            int B = sc.nextInt();//1
            int gaps = B+1;//2
            int extra = R%gaps;//1
            int groupSize = R/gaps;//2

            StringBuilder ans= new StringBuilder("");
            for(int i=0;i<gaps;i++){
              int fillReds = groupSize;
              if(extra > 0){extra--; fillReds++;}
              while(fillReds -- > 0) ans.append('R');//RR, RR
              if(i<B) ans.append('B');//B, B
            }
            System.out.println(ans.toString());
        }
    }
}
