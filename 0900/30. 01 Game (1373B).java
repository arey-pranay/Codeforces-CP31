import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			String s = sc.nextLine();
			int zeroes = 0;
			int ones = 0;
			for(char c:s.toCharArray()) {
				if(c=='0')zeroes++;
				else ones++;
			}
			String ans = (Math.min(zeroes,ones) % 2 ) == 0 ? "NET" : "DA";
			System.out.println(ans);
		}
		sc.close();
	}
}
