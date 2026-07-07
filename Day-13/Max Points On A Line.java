class Solution {
    public int maxPoints(int[][] points) {
       // write a code here
       int n=points.length;
       if(n<=2)
         return n;
        int ans=1;
        for(int i=0;i<n;i++){
            Map<String,Integer>map = new HashMap<>();
            int localMax=0;
            for(int j=i+1;j<n;j++){
                int dy=points[j][1]-points[i][1];
                int dx= points[j][0]-points[i][0];
                int g =gcd (Math.abs(dy),Math.abs(dx));
                dy/=g;
                dx/=g;
                if(dx<0){
                    dx=-dx;
                    dy=-dy;
                }
                String key=dy+"/"+dx;
                map.put(key,map.getOrDefault(key,0)+1);
                localMax=Math.max(localMax,map.get(key));

            }
            ans=Math.max(ans,localMax+1);
        }  
        return ans;
    }
    private int gcd(int a, int b){
        if(b==0)
          return a;
        return gcd (b,a%b);  
    }
}