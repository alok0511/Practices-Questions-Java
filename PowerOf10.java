import java.util.Scanner;
public class PowerOf10 {

	public static boolean isPower(int in){
		if(in % 10 !=0 || in == 0){
			return false;
		}
		if(in == 10){
			return true;
		}
		return isPower(in/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPower(num));
	}
}
