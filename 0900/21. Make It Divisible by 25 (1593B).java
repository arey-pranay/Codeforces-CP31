import java.util.*;
public class Main {
    int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) { 
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            int len = s.length();
            int ans = 0;
            int index =len-1;
            String[] endings = {"00","25","50","75"};
            while(index>=0 && (sb.charAt(index) != '5' && s.charAt(index) != '0'))index--;
            s = sb.substring(0, index+1);
            ans += len - s.length();
            len = s.length();
            int min = Integer.MAX_VALUE;
            for(String e : endings){
                int j = 1;
                int curr = 0;
                for(int i = s.length()-1; i>=0; i--){
                    if(e.charAt(j)==s.charAt(i)){if(--j<0) break;}
                    else curr++;
                }
                min = Math.min(min,curr);
            }
            System.out.println(ans+min);
        }
    }
}
