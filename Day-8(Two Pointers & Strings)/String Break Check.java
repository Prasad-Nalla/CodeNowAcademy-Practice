class Solution {
    public static boolean check_if_can_break(String s1, String s2) {
        // Write your logic here
        if(s1.length()!=s2.length())
           return false;
        char []c1= s1.toCharArray();
        Arrays.sort(c1);
        char c2[]=s2.toCharArray();
        Arrays.sort(c2);
        boolean s1c=true,s2c=true;
        for(int i=0;i<s1.length();i++){
            if(c1[i]>c2[i]) {
                    s1c=false;
            }
            if(c1[i]>c2[i])
                s2c=false;
        }
        

        return s1c||s2c;
    }
}