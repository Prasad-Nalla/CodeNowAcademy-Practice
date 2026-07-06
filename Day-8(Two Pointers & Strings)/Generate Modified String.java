class Solution {
    public static String modifyString(int n, String s) {
        // Write your logic here
        List<Integer>prime=new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        int sum=0,i=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit=ch-'0';
                if(prime.contains((digit))){
                    sum+=digit;
                    i++;
                }
            }
        }
        int avg=(i!=0)?sum/i:0;
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                str.append(ch);
            }
            else{
              int k=ch-'0';
              if(avg!=0)
                k=k%avg;
                str.append((char)(97+k));
            }
        }
        return str.toString();
    }
}