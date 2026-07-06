class Solution {
    public int solve(int[] x) {
        // Write your solution here
        Arrays.sort(x);
        int firstEven=-1,lastEven =-1,firstOdd=-1,lastOdd=-1;
        for(int i=0;i<x.length;i++){
            if((x[i]&1)==0){
                if(firstEven ==-1)
                    firstEven=i;
                    lastEven=i;
                
            }
            else {

            
              if(firstOdd==-1)
                firstOdd=i;
               lastOdd=i;
              
        }
        }
        int maxLen=0;
        if(firstEven!=-1){
          maxLen=Math.max(maxLen,lastEven -firstEven+1);
        if(firstOdd!=-1)
           maxLen=Math.max(maxLen,lastOdd-firstOdd+1);

        }
        return x.length-maxLen;
    }
}
