import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclicsort {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        String b ="monk";
        b="10";
        System.out.printf(b);


        int i=0;
        int temp=0;
        while(i<nums.length){

            if(nums[nums[i]-1]==nums[i]){
                i++;

            }
            else{
                if(nums[i]>nums.length){
                    i++;
                }
                else{

                    temp=nums[i];
                    nums[i]=nums[nums[i]-1];
                    nums[temp-1]=temp;

                }
            }


        }
        for(int j=1;j<=nums.length;j++){
            if(nums[j-1]==j){
                continue;
            }
            else{
                arr.add(j);

            }
        }
        return arr;

    }
    public static void main(String[] args){
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));


    }
}
