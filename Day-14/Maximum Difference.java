class Solution {
    public static int userLogic(int n, int[] arr) {
        // Write your logic here
        int maxDiff=Integer.MIN_VALUE;
        int maxSmall=arr[0];
        for(int i=1;i<n;i++){
            maxDiff=Math.max(maxDiff,arr[i]-maxSmall);
            maxSmall=Math.min(maxSmall,arr[i]);
        }
        return maxDiff;
    }
}