class Solution {
    public int longestConsecutive(int[] nums) {
        // Write your solution here
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums)
           set.add(i);
        int count =0,longest=0;
       for(int i:set){
        if(!set.contains(i-1)){
            int temp=i;
            count=1;
            while(set.contains(temp+1)){
                temp++;
                count++;
            }
            longest=Math.max(longest,count);
        }
       }
        return longest;
    }
}
