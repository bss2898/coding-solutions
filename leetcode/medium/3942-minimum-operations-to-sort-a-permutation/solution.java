class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int zero=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero=i;
                break;
            }
        }

        boolean normal=true;
        boolean reverse=true;

        for(int i=0;i<n;i++){
            if(nums[(zero+i)%n]!=i){
                normal=false;
                break;
            }
        }

        int last=n-1;
        for(int i=0;i<n;i++){
            if(nums[(last-i+n)%n]!=i){
                reverse=false;
                break;
            }
        }

        if(normal)
            return zero;

        if(reverse)
            return 1+(n-1-last+n)%n;

        return -1;
    }
}