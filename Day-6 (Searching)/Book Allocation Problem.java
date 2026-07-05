class Solution {
    public int allocateBooks(int[] arr, int m) {
        // Write your solution here
        int n=arr.length;
        if(m>n)
           return -1;
        int low=0;
        int high=0;
        for(int pages :arr){
            low = Math.max(low,pages);
            high+=pages;
        }
        int ans=-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(isPossible(arr,m,mid)){
                ans= mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }   
       
        return ans;
    }
    private boolean isPossible(int [] arr,int m,int maxPages){
        int students=1;
        int pages =0;
        for(int book:arr){
            if(pages+book<=maxPages){
                pages+=book;
            }
            else{
                students++;
                pages=book;
                if(students>m)
                   return false;
            }
        }
            return true;
    }
}
