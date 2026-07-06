class Solution {
    public static int minimumTimeToSolveProblems(int n, int k, int[] times) {
        // Write your logic here
        if(k==0)
           return 0;
           if(n==0)
               return -1;
        long maxTime=0;
        boolean hasValidMember=false;
        for(int t:times) {
            if(t>0){
                hasValidMember=true;
            maxTime=Math.max(maxTime,t);
            }
        }  
        if(!hasValidMember)
           return -1;
        long low=1;
        long high=(long)maxTime*k;
        long ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            long solved=0;
            for(int t: times){
                if(t==0)
                  continue;
                solved+=mid/t;
                if(solved>=k)
                   break;
            }
            if(solved>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
              
        }
        return (int)ans;
    }
}