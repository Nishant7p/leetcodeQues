class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr={0,0};


        HashSet<Integer> m1=new HashSet<>();
         HashSet<Integer> m2=new HashSet<>();


         for(int i:nums1){
            m1.add(i);
         }

         for(int i:nums2){
            m2.add(i);
         }

         for(int i:nums1){
            if(m2.contains(i)){
                arr[0]++;
            }
         }

         for(int i:nums2){
            if(m1.contains(i)){
                arr[1]++;
            }
         }









        return arr;
        
    }
}