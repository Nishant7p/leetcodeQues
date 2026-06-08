1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3       List<Integer> less=new ArrayList<>();
4       List<Integer> eq=new ArrayList<>();
5       List<Integer> more=new ArrayList<>();
6
7        for(int i:nums){
8            if(i<pivot){
9                less.add(i);
10            }
11            else if(i==pivot){
12                eq.add(i);
13            }
14            else{
15                more.add(i);
16            }
17        }
18        int i=0;
19        for(int num:less){
20            nums[i]=num;
21            i++;
22        }
23        for(int num:eq){
24            nums[i]=num;
25            i++;
26        }
27        for(int num:more){
28            nums[i]=num;
29            i++;
30        }
31        return nums;
32       
33}
34}