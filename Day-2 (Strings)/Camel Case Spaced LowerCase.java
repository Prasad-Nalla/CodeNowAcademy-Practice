class Solution {
    public String convertCamelCase(String cstr) {
        // Write your solution here
        StringBuffer s= new StringBuffer();
        for(char c:cstr.toCharArray()){
            if(c-65<32){
                c=Character.toLowerCase(c);
                s.append(" "+c);
            }
            else{
                s.append(c);
            }
        }
        return s.toString();
    }
}
