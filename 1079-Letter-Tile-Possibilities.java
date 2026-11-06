class Solution {
    public void help(StringBuilder sb,char[] arr,int i,HashSet<String> set,int[] vis){
        if(i==arr.length){
            String s=sb.toString();
            set.add(s);
            return ;
        }

        for(int j=0;j<arr.length;j++){
            if(vis[j]==0){
                vis[j]=1;
                sb.append(arr[j]);
                set.add(sb.toString());
                help(sb,arr,i+1,set,vis);
                sb.deleteCharAt(sb.length()-1);
                vis[j]=0;
                //help(sb,arr,i+1,set,vis);
            }
        }


    }
    public int numTilePossibilities(String tiles) {

        HashSet<String> set=new HashSet();


        char[] ch=tiles.toCharArray();
        StringBuilder sb=new StringBuilder();
        int[] vis=new int[ch.length];


        help(sb,ch,0,set,vis);
        System.out.print(set);










        return set.size();
        
    }
}