import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks >= 75)
			System.out.println("Distinction");
		else if(marks >= 60 && marks <=74)
			System.out.println("First Class");
		else if(marks >= 50 && marks <60)
			System.out.println("Passing");
		else
			System.out.println("Fail");

	}

}
