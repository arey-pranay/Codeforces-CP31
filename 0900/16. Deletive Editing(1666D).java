import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            String t = sc.next();

            HashSet<Character> found = new HashSet<>();;
    
            int j = t.length() - 1;
            for(int i = s.length() - 1; i>= 0; i--) {
                char curr = s.charAt(i);
                if (j >= 0 && s.charAt(i) == t.charAt(j)) 
                    if(found.contains(curr)) break;
                    else j--;
                else found.add(curr);
            }

            System.out.println(j == -1 ? "YES" : "NO");
        }
    }
}
