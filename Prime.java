import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag=0;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
