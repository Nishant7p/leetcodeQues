class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int c=0;


        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c=1;
                ans.add(i);
            }
            else if(c==1){
                break;
            }

        }
        return ans;


        
    }
}