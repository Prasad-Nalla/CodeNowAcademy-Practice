class Solution {
    public static boolean check(int n){
        if(n==0)
           return true;
        boolean arr[]= new boolean[10];
       while(n>0){
        int digit=n%10;
        if(arr[digit]){
            return false;
        }
        arr[digit]=true;
        n/=10;

       }
       return true;
    }
    public static int countUniqueDigitNumbers(int n1, int n2) {
        // Write your solution here
        int count=0;
        for(int i=n1;i<=n2;i++){
            if(check(i))
              count++;
        }
        return count;

        
    }
}
