class Solution {
    public long maxScore(int[] a, int[] b) {
        // write code here
        int n=a.length;
        long pref[]=new long[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+b[i];
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n;){
            int val=a[i];
            int idx= lowerBound(a,val);
            int usable = n-idx;
            int levels = upperBound(pref,usable)-1;
            ans=Math.max(ans,1L*val*levels);
            while(i<n && a[i]==val)
                i++;
          }
        return ans;
    }
    private int lowerBound(int [] arr, int target){
        int l=0,r=arr.length;
        while(l<r){
            int mid =(l+r)/2;
            if(arr[mid]<target)
               l=mid+1;
            else 
              r= mid;   
        }
        return l;
    }
    private int upperBound(long[] arr, long target){
        int l=0,r=arr.length;
        while(l<r){
            int mid =(l+r)/2;
            if(arr[mid]<= target)
              l=mid+1;
            else 
              r=mid;  
        }
        return  l;
    }
}
