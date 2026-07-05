class Solution {
    public static String reverseLettersOnly(String str) {
        // Write your solution here
    StringBuffer s= new StringBuffer(str);
    int left=0,right=s.length()-1;
    while(left<right){
        if(Character.isDigit(s.charAt(left)))
            left++;
        else if(Character.isDigit(s.charAt(right)))
           right--;
        else{
            char c=s.charAt(left);
            s.setCharAt(left,s.charAt(right));
            s.setCharAt(right,c);
            left++;
            right--;
        }   
    }
    return new String(s);
    }
}
