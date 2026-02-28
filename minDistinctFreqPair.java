class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] ans={-1,-1};
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
            if(i<min){
                min=i;
            }
        }
        ans[0]=min;
        int m_f=map.get(min);
        int min2=Integer.MAX_VALUE;
        for(int k:map.keySet()){
            if(map.get(k)!=m_f){
                if(k<min2){
                    min2=k;
                    ans[1]=k;
                    
                }
            }
            
        }
        if(ans[1]==-1){
            ans[0]=-1;
            return ans;
        }
        return ans;
        
    }
}©leetcode
