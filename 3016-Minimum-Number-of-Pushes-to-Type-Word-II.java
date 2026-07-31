class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int x=c-'a';
            arr[x]++;

        }
        Arrays.sort(arr);
        int x=0;
        int j=0;
        int ans=0;


        for(int i=25;i>=0;i--){
            if(x%8==0){
                j++;
            }
            x++;
            ans=ans+arr[i]*j;
            




        }
        return ans;
    }
}
