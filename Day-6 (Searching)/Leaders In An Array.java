import java.util.*;

class Main{
	public static void main(String args[])
	{
		//Write your code here...
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	List<Integer> list= new ArrayList<>();
	int large=arr[n-1];
	list.add(large);
	for(int i=n-2;i>=0;i--){
		if(arr[i]>large){
			large=arr[i];
			list.add(large);
		}
	}
	Collections.reverse(list);
	
	
	for(int i:list){
				System.out.print(i+" ");

	}
	// System.out.println(l);
	}
}