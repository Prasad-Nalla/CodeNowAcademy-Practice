class Solution {
     public long minimumAdjacentSwaps(String s) {
           // write a code here
           return Math.min(Swaps(s,'1'),Swaps(s,'0'));
     }
     private long Swaps(String s , char ch){
        List<Integer> p= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                p.add(i);
            }
        }
        if(p.isEmpty() || p.size()==1){
            return 0;
        }
        int medianIndex=p.size()/2;
        int medianValue=p.get(medianIndex)-medianIndex;
        long totalSwaps=0;
        for(int i=0;i<p.size();i++){
            int normalizesPos=p.get(i)-i;
            totalSwaps+=Math.abs(normalizesPos-medianValue);
        }
     return totalSwaps;
     }
}