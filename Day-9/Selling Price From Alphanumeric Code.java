class Solution {
    public static int calculateSellingPrice(String str) {
        // Write your solution here
        int i=0;
        int sum=0;
        StringBuilder s= new StringBuilder();
                while(i<str.length()){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                s.append(ch);
                while(i+1<str.length() && Character.isDigit(str.charAt(i+1))){
                    i++;
                    s.append(str.charAt(i));
                }
                
            }
            else{

                if(s.length()>0){

                sum+=Integer.parseInt(s.toString());
                s.setLength(0);
                
                }
                
                }
                    i++;

            }
            if(s.length()>0){
                sum+=Integer.parseInt(s.toString());
            }
        return sum;
        }
    }

