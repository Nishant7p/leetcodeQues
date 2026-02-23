class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
         Set<Integer> set2=new HashSet<>();

         for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
         }
         for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
         }
        Set<Integer> x1=new HashSet<>(set1);
        Set<Integer> x2=new HashSet<>(set2);
        x1.removeAll(set2);
        x2.removeAll(set1);
          List<Integer> ans1=new ArrayList<>();
          List<Integer> ans2=new ArrayList<>();
          for(int i:x1){
            ans1.add(i);

          }
          for(int i:x2){
            ans2.add(i);

          }
          ans.add(ans1);
          ans.add(ans2);
          return ans;

    }
}
