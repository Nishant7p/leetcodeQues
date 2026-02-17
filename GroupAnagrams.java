class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>> main=new HashMap<>();

        for(String i:strs){
            HashMap<Character,Integer> hp=new HashMap<>();
            for(int j=0;j<i.length();j++){
                char c=i.charAt(j);
                if(!hp.containsKey(c)){
                    hp.put(c,1);
                }
                else{
                    hp.put(c,hp.get(c)+1);
                }

            }
            if(main.containsKey(hp)){
                main.get(hp).add(i);
            }
            else{
                ArrayList<String> arr=new ArrayList<>();
                arr.add(i);
                main.put(hp,arr);
            }
        }
        List<List<String>> ans=new ArrayList<>();

        for(ArrayList<String> v:main.values()){
            ans.add(v);
        }







        return ans;

        
    }
}
