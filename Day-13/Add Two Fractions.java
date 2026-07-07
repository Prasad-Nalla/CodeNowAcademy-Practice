class Solution {

    public String addFractions(String frac1, String frac2) {
       // write code here
       String []f1=frac1.split("/");
       String [] f2= frac2.split("/");
       int a=Integer.parseInt(f1[0]);
       int b=Integer.parseInt(f1[1]);
       int c=Integer.parseInt(f2[0]);
       int d= Integer.parseInt(f2[1]);
       int num=a*d+c*b;
       int den=b*d;
       int g=gcd(num,den);
       num/=g;
       den/=g;
       return num+"/"+den;

    }
    private int gcd(int a,int b){
        if(a==0)
           return b;
        return gcd(b%a,a);   
    }
}