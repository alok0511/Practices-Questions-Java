import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]);

	}

}
