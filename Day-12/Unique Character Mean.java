class Solution {
    public static String determine_winner(int N, String smit_str, String joy_str) {
        // Write your logic here
        int arr[]= new int[26];
        for(char ch:smit_str.toCharArray()){
            arr[ch-'a']+=1;
        }
        int c1=0;
        for(int i:arr){
            if(i==1){
                c1++;
            }
        }
        Arrays.fill(arr,0);
        for(char ch:joy_str.toCharArray()){
            arr[ch-'a']+=1;
        }
        int c2=0;
        for(int i:arr){
            if(i==1)
               c2++;
        }
        int n1=c1/smit_str.length();
        int n2=c2/ joy_str.length();
        if(n1>n2){
            return "SMIT";
        }
        else if(n1<n2){
            return "JOY";
        }
        
        return " TIE";
    }
}