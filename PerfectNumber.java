import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,sum=0,temp;
		temp=num;
		for(i=1;i<num;i++){
			if(num%i==0){
		
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}

}
