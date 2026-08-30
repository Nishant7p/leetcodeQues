class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int x=-1;
        int y=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(cur>max){
                x=i;
                max=cur;
            }
            if(cur<min){
                y=i;
                min=cur;
            }

        }
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int aage=-1;
        aage=Math.max(x,y)+1;
        int peeche=Math.max(n-x,n-y);
        int cross=x+n-y;
        int cross2=y+n-x;
        int mid=Math.min(cross,cross2)+1;

        return Math.min(Math.min(aage,peeche),mid);

        
        
    }
}