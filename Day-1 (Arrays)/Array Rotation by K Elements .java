class Solution {
    public static int[] rotateArray(int n, int[] arr, int k) {
        // Write your solution here
    k=k%n;
    int temp,left,right;
    left=0;right=k-1;
    while(left<right)
    {
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    left=k;right=n-1;
    while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
     left=0;right=n-1;
    while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
        return arr;
    }
}
