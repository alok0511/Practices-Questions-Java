import java.util.Scanner;
public class PowerOf2 {

	public static boolean isPower(int in){
		if(in % 2 !=0 || in == 0){
			return false;
		}
		if(in == 2){
			return true;
		}
		return isPower(in/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPower(num));
	}
}
