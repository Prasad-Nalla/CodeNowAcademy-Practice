class Solution {
    public int countSpecialTriplets(int[] arr, int N) {
        //write code here
        int i=0,j=1,k=2;
        int count =0;
        while(k<N){
            if(arr[i]+arr[k]==arr[j])
              count++;
            i++;
            j++;
            k++;  
        }
        return count;
    }
}