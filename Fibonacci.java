import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c=0,i;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=2;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}

	}

}
