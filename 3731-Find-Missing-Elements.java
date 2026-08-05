class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans=new ArrayList<Integer>();
        int min=nums[0];
        int max=nums[nums.length-1];
        int j=0;
        for(int i=min;i<max;i++){
            if(i==nums[j]){
                j++;

            }
            else{
                ans.add(i);
            }


        }
        
        return ans;
        
    }
}