import java.util.*;

class Main{
	public static void main(String args[])
	{
		//Write your code here...
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]+arr[r]<target)
                l++;
            else if(arr[l]+arr[r]>target)
               r--;
            else {

            //    System.out.print(l,r); 
               break;     
            }
        }
        l++;
        r++;
        System.out.print(l+" "+r);
	}
}
