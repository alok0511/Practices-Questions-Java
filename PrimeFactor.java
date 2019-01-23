import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,t;
		if(num>=2){
			t=num;
		for(i=2;i<t;i++){
			while(t%i==0){
				System.out.print(i+" ");
				t=t/i;
				
			}
		}
		if(t>2){
			System.out.print(t);
		}
		else {
			System.out.println("There is no prime factorization");
		}

	}
	}

}
