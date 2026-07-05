class Solution {
    public int[] topKFrequent(int[] num, int k) {
        // Write your solution here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:num)
           map.put(i,map.getOrDefault(i,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());  
        list.sort((a,b)-> b.getValue() -a.getValue());

        int arr[]= new int [k];
        for(int i=0;i<k;i++){
                arr[i]=list.get(i).getKey();
        }   
        return arr;
    }
}
