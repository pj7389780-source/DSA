class Solution {
    public int search(int[] nums, int target) {
        int last = nums.length-1,first=0;
        while(first<=last){
            int mid = first + ((last-first)/2);
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) last=mid-1;
            else first=mid+1;
        }
        return -1;
    }
}