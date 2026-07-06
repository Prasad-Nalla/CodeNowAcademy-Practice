class Solution {

    public int countRepeatingCharacters(String str) {
        // write code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(int i:map.values()){
            if(i>1)
              c++;
        }
        return c;
    }
}