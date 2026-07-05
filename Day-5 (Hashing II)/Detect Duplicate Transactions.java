class Solution {
    public List<String> findDuplicateTransactions(List<String> transactions) {
           // write code here
           HashMap<String,Integer> map= new HashMap<>();
           for(String s:transactions){
            map.put(s,map.getOrDefault(s,0)+1);
           }
           List <String> list = new ArrayList<>();
           for(String s: map.keySet()){
            if(map.get(s)>1)
               list.add(s);
           }
           Collections.sort(list);
           if (list.isEmpty()){
                list.add("-1");
              return list;
           }
           return list;
    }

}