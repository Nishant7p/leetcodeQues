1class Solution {
2    func firstMissingPositive(_ nums: [Int]) -> Int {
3        var nums=nums
4        var i=0
5
6        while(i<nums.count){
7            if(nums[i]>0 && nums[i]<=nums.count && nums[i] != nums[nums[i]-1]){
8                let temp=nums[i]
9                nums[i]=nums[nums[i]-1]
10                nums[temp-1]=temp
11
12            }
13            else{
14                i=i+1
15            }
16        }
17        for j in 0..<nums.count{
18            if(nums[j] != j+1){
19                return j+1
20            }
21        }
22        return nums.count+1
23
24    }
25}