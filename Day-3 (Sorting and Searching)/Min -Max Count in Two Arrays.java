import java.util.*;

class Main{
	public static void main(String args[])
	{
		//Write your code here...
		int l1,l2;
		Scanner sc =new Scanner(System.in);
		l1=sc.nextInt();
		l2=sc.nextInt();
		int arr1[]= new int[l1];
		int arr2[]=new int[l2];
		for(int i=0;i<l1;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<l2;i++){
			arr2[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int c1=0,c2=0;
		for(int i:arr1){
			if(i>n)
			  c1++;
		}
		for(int i:arr2){
			if(i<n)
			   c2++;
		}
		 System.out.print(Math.max(c1,c2));
	}
}
