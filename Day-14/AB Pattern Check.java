class Solution {

    public static String follows_ab_pattern(String s) {
        Scanner scan = new Scanner(System.in);
       //write your code here
        boolean b=false;
           for(char ch:s.toCharArray()){
            if(ch=='b'){
                b=true;
            }
            else if(b){
                return "NO";
            }
            

       }
       return "YES";
    }

   
}