
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sum=0,temp=0;
		for(i=1;i<100;i++){
			sum=0;
			temp=i;
			for(j=1;j<i;j++){
			if(i%j==0){
		
				sum=sum+j;
			}
		}
		if(temp==sum)
			System.out.println("Perfect Number:" + sum);
		
	}
	}

}
