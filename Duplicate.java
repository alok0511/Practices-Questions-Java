import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word[] = str.split(" ");
		int l=word.length;
		for(int i=0;i<l;i++){
			if(word[i]!=null){
				for(int j=i+1;j<l;j++){
					if(word[i].equals(word[j]))
						word[j]=null;
				}
			}
		}
		for(int i=0;i<word.length;i++)
		{
			if(word[i]!=null)
				System.out.print(word[i]+" ");
		}

	}

}
