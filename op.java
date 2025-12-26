class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        { int prevsum=0;
            int idx=i;
            while(idx<nums.length && prevsum<=sum)
            { prevsum+=nums[idx];
                idx++;
            }
            if(prevsum>=sum)sum=prevsum;
        }
        return sum;
    }
}
