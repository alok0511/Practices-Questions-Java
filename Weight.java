import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.nextLine().toUpperCase();
		int sum = 0;
		for (char ch : str.toCharArray()) {
		    if (ch >= 'A' && ch <= 'Z') {
		        sum =sum + 1 + ch - 'A';
		    }
		}
		System.out.println(sum);

	}

}
