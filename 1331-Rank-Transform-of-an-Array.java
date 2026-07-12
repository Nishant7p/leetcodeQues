class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        int[] ans=new int[arr.length];

        Arrays.sort(arr);
        int n=arr.length;
        int r=1;
        if(arr.length==0){
            return ans;
        }
        ans[0]=1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                ans[i]=r;
            }
            else{

            r++;
            ans[i]=r;
            }

        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],ans[i]);
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(temp[i]);
            System.out.println(temp[i]);
        }




        return ans;
        
    }
}