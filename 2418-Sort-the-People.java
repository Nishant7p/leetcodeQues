class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] ans=new String[names.length];
        HashMap<Integer,String> map=new HashMap();



        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);


        }
        Arrays.sort(heights);
        int j=names.length-1;
        for(int i:heights){
            ans[j]=map.get(i);
            j--;
        }






        return ans;
        
    }
}