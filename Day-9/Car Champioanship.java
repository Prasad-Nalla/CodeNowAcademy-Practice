class Solution {
    public static int countSeconds(int n1, int n2, int x) {
        // Write your solution here
        if(n1>n2 || n1==n2)
           return -1;
        int gap = n2-n1;
        return (x/gap)+1;  
        
    }
}
