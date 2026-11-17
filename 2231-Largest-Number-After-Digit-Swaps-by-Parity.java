class Solution {
    public int largestInteger(int num) {
        List<Integer> arr=new ArrayList();
        int ans=0;
        int e=0;
        int o=0;
        int t=num;

        while(t>0){
            int d=t%10;
            if(d%2==0){
                e++;

            }
            else{
                o++;
            }
            arr.add(d);
            t=t/10;

        }

        int[] even=new int[e];
        int[] odd=new int[o];
        int j=0;
        int k=0;

        for(int i:arr){
            if(i%2==0){
                even[j]=i;
                j++;
            }
            else{
                odd[k]=i;
                k++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);

        j=odd.length-1;
        k=even.length-1;
        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)%2==0){
                ans=ans*10;
                ans+=even[k];
                k--;
            }
            else{
                ans=ans*10;
                ans+=odd[j];
                j--;

            }
        }














        











        return ans;

        
    }
}