1class Solution {
2     public boolean increasingTriplet(int[] nums) {
3
4        int first_smallest = Integer.MAX_VALUE;
5        int second_smallest = Integer.MAX_VALUE;
6
7        for(int current_value : nums){
8
9            if(current_value <= first_smallest){
10                first_smallest = current_value;
11            }
12            else if(current_value <= second_smallest){
13                second_smallest = current_value;
14            }
15            else{
16                return true;
17            }
18        }
19
20        return false;
21    }
22}