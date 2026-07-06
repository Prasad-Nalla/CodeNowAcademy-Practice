class Solution {
    public StringBuilder build(char c,int n){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++){
            s.append(c);
        }
        return s;
    }
    public String expandString(String s) {
        // write code here
        StringBuilder str= new StringBuilder();
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length() && (map.size()<=26);i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i+1);
            }
        }
        for(char ch : s.toCharArray()){
            str.append(build(ch,map.get(ch)));
            str.append("-");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}