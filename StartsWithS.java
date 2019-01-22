
public class StartsWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word[]={"sample","apple","search","cat"};
		int l1=word.length;
		for(int i=0;i<l1;i++){
			if(word[i].charAt(0)=='s')
				System.out.println(word[i]);
		}

	}

}
