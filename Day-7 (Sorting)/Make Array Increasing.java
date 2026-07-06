//alreday pair class definded
/*static class Pair {
        int type, index;
        Pair(int t, int i) {
            type = t;
            index = i;
        }
}*/
class Solution {
    public List<Pair> solve(int n, int[] a, int[] b) {
        // Write your solution here
        List<Pair> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    ans.add(new Pair(1,j+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(b[j]>b[j+1]){
                    int t= b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                    ans.add(new Pair(2,j+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>b[i]){
                int t= a[i];
                a[i]=b[i];
                b[i]=t;
                ans.add(new Pair(3,i+1));
            }
        }
        return ans;
    }
}
