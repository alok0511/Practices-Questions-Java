import java.util.Scanner;
public class PowerOf5 {

	public static boolean isPower(int in){
		if(in % 5 !=0 || in == 0){
			return false;
		}
		if(in == 5){
			return true;
		}
		return isPower(in/5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPower(num));
	}
}