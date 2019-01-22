import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int d,i,fact,temp,sum=0;
		temp=num;
		while(num!=0){
			fact=1;
			i=1;
			d=num%10;
			while(i<=d){
				fact=fact*i;
				i++;
			}
			
			sum=sum+fact;
			num=num/10;
			
		}
		if(sum==temp)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");

	}

}
