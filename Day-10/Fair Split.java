class Solution {
    public static int countFairSplits(int n, int[] A) {
        // Write your solution here
        int sum=0;
        for(int i : A){
            sum+=i;
        }
        if(sum%2==0){
            return n-1;
        }
        return 0;
    }
}
