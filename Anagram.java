import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		int i,j,c=0,d=0;
		if(len1 == len2){
			for(i=0;i<len1;i++){
				c=0;
				for(j=0;j<len1;j++){
					if(str1.charAt(i) == str2.charAt(j)){
						c=1;
						break;
					}
				}
				if(c==0){
					d=1;
					break;
				}
			}
		if(d==1)
			System.out.println("Not Anagram");
		else
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");

	}

}
