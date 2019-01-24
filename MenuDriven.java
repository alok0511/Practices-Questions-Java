import java.util.Scanner;
public class MenuDriven {
	
	public static int add(int a,int b){
		return a+b;
	}
	public static int subtract(int a,int b){
		return a-b;
	}
	public static int multiply(int a,int b){
		return a*b;
	}
	public static double divide(int a,int b){
		return (double)a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 for exit");
			System.out.println("Enter your choice");
			int n1,n2,ch;
			ch= sc.nextInt();
			switch(ch){
			case 1:n1=sc.nextInt();
				   n2=sc.nextInt();
				   System.out.println(add(n1,n2));
				   break;
			case 2:n1=sc.nextInt();
			       n2=sc.nextInt();
			       System.out.println(subtract(n1,n2));
			       break;
			case 3:n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println(multiply(n1,n2));
		           break;
			case 4:n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println(divide(n1,n2));
		           break;
			case 5:System.out.println("Successfully Terminated");
				   System.exit(0);
				   break;
		    default:System.out.println("Wrong Input");
			}
		}
	}
}
