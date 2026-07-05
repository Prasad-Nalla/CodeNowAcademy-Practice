class Solution {
    public static String findMissingLetters(String str) {
        // Write your solution here
        str=str.toLowerCase();
        boolean check[]= new boolean [26];
        for(char c:str.toCharArray()){
            if(Character.isLetter(c) ){
                check[c-'a']=true;
            }
        }
        StringBuffer s=new StringBuffer();
        for(int i=0;i<26;i++){
            if(!check[i]){
                s.append((char)('a'+i));
            }
        }
        if(s.length()==0)
          return "0";
        return s.toString() ;
    }
}
