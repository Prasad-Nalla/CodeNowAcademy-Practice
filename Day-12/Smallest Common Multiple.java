class Solution {
    public static long gcd(long a, long b){
        if(b==0)
          return a;
         
           return gcd(b,a%b);
    }
    public static long computeX(long p, long n) {
        // Write your logic here
        long g=(p*n)/gcd(p,n);
        return g;
    }
}