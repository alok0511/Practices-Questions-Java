
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,3,6,7,9};
		int arr2[]={-1,4,8,10};
		int arr3[] = new int[arr1.length + arr2.length];
		int c=0;
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
			c++;
		}
		for(int j=0;j<arr2.length;j++){
			arr3[c++]=arr2[j];
		}
		int l=arr3.length;
		for(int k=1;k<l;k++){
		int key=arr3[k];
		int j=k-1;
		while(j>=0 && arr3[j]>key){
			arr3[j+1]=arr3[j];
			j=j-1;
		}
		arr3[j+1]=key;
		}
		int med=(int)Math.ceil(l/2);
		System.out.println(arr3[med]);

	}

}
