class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        int x=0;
        for(int v:map.values()){
            set.add(v);
            x++;
        }
        if(x==set.size()){
            return true;
        }
        return false;
        
    }
}
