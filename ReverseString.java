import java.util.Scanner;
public class ReverseString {
	public static String reverseStr(String str){
		char ch[] = str.toCharArray();
		char res[] = new char[ch.length];
		for(int i=0;i<ch.length;i++){
			if(ch[i] == ' ')
				res[i]=' ';
		}
		int j=res.length - 1;
		for(int i = 0;i < ch.length;i++){
			if(ch[i]!=' '){
				if(res[j]==' '){
					j--;
			}
			res[j]=ch[i];
			j--;
			}
		}
		return String.valueOf(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println(reverseStr(str1));
		

	}

}
