import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcodequesonBinarySearchandCyclicsort {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        for (int i=0;i<candies.length;i++){
            res.add(i,true);
        }



        int max;
        for(int i=0;i<candies.length;i++){
            max=candies[i];
            candies[i]=candies[i]+extraCandies;

            for(int j=0;j<candies.length;j++){
                if(candies[j]>candies[i]){
                    res.set(i,false);


                }
            }
            candies[i]=max;



        }return res; }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int pairs = 0;

        for (int num : nums) {
            // If the number has already been seen, its current count determines
            // how many new pairs can be formed with the current number.
            if (countMap.containsKey(num)) {
                pairs += countMap.get(num);
            }
            // Increment the frequency of the current number
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return pairs;}
    public static int ciel(int[] num,int target){
        if(target>num[num.length-1]){
            return -1;
        }
        int start=0;
        int end=num.length-1;
        int mid=(start+end)/2;
        while (start<=end){
            if(target==num[mid]){
                return num[mid];
            }


            if(target<=num[mid]){
                end=mid-1;
               mid=(start+end)/2;
            } else if (target>=num[mid]) {
                start=mid+1;
                mid=start+end/2;

            }
        }
        return num[start];


    }
    public static char nextGreatestLetter(char[] arr, char target) {


        int start=0;
        int end=arr.length-1;
        if(target>=arr[end]){
            return arr[0];
        }
        int mid=start+(end-start)/2;
        while (start<=end){
            if(arr[mid]==target){
                start=mid+1;
                mid=start+end/2;
            }
            if(arr[mid]<target){
                end=mid-1;


                mid=(start+end)/2;

            } else if (arr[mid]>target){

                start=mid+1;
                mid=(start+end)/2;
            }


        }

    return arr[start];}
    public static int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        if(nums.length==0){
            return res;
        }
        if(nums.length==1){
            if(nums[0]==target){
                res[0]=0;
                res[1]=0;
                return res;
            }else {
                return res;
            }
        }


        int start=0;
        int f=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if(nums[mid]==target){
                f=1;
                break;
            }
            if(nums[mid]<target){
                start=mid+1;
                mid=(start+end)/2;

            } else if (nums[mid]>target) {
                end=mid-1;
                mid=(start+end)/2;


            }


        }
        if(f==0){
            return res;
        }

        start=0;
        end=nums.length-1;
        mid=start+(end-start)/2;
        while (start<=end){
                if(nums[mid]==target){
                    start=mid+1;
                    mid=(start+end)/2;
                }
            if(nums[mid]<target){
                start=mid+1;
                mid=(start+end)/2;

            } else if (nums[mid]>target) {
                end=mid-1;
                mid=(start+end)/2;


            }


        }
        res[1]=start-1;
         start=0;
         end=nums.length-1;
         mid=start+(end-start)/2;
        while (start<=end){
            if(nums[mid]==target){
                end=mid-1;
                mid=(start+end)/2;
            }
            if(nums[mid]<target){
                start=mid+1;
                mid=(start+end)/2;

            } else if (nums[mid]>target) {
                end=mid-1;
                mid=(start+end)/2;


            }


        }








        res[0]=end+1;




        return res;



    }
    public static int maximumPopulation(int[][] logs) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int j=0;
        for(int[] i:logs ){
            if(!map.containsKey(i[0])){
                map.put(i[0],1);

            }
            else{
                map.put(i[0],map.get(i[0])+1);
            }







        }
        System.out.println(map);

return count;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];

        }
        sortt(arr,0,nums.length-1);

        int[] res=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            map.putIfAbsent(arr[i],i);

        }
        for (int i=0;i<nums.length;i++){
            res[i]=map.get(nums[i]);
        }
        return res;




    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        long result=0;
        System.out.println(Arrays.toString(num));
        for(int i:num){
            result=result*10+i;

        }
        result=result+k;


        long  digit= 0;



        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=(int)Math.log10(result)+1;i++){


            digit=result%(long) Math.pow(10,(int)Math.log10(result)-i+2);



            digit=digit/(long)Math.pow(10,(int) Math.log10(result)+1-i);

            ans.add(i-1, (int) digit);


        }
        System.out.println(ans);


        return ans;

    }


    public static int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while (start<=end){
            mid=start+(end-start)/2;

            if(end-start==1){
                break;

            }
            if (k<arr[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        System.out.println("start: "+start+" end: "+end);
   return 0; }



    public static int[] plusOne(int[] arr) {

        if( arr[arr.length-1]!=9){
            arr[arr.length-1]=arr[arr.length-1]+1;
           return arr;

        }
        else {
            int i=arr.length-1;
            while (arr[i]==9&&i>0){
                arr[i]=0;
                i--;


            }
            if(i==0&&arr[i]==9){
                int[] m=new int[arr.length+1];
                m[0]=1;
                return m;


            }
            else{
                arr[i]=arr[i]+1;

            }


        }








return arr;
    }
    public static void rotate(int[] nums, int k) {
        int temp=0;
        while(k!=0){
            //shift(nums[]);
            temp=nums[nums.length-1];
            int tem2=1;

            for(int i=0;i<nums.length-2;i++){




                nums[i+1]=tem2;
                tem2=nums[i];




            }
            nums[0]=temp;
            k--;


        }
        System.out.println(Arrays.toString(nums));

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int colstart=0;
        List<Integer> map=new ArrayList<>();
        int colend=matrix[0].length-1;
        int rowstart=0;
        int rowend=matrix.length-1;


        while(colstart<=colend&&rowstart<=rowend){
            for(int i=colstart;i<=colend;i++){
                map.add(matrix[rowstart][i]);
            }
            rowstart++;

            for(int i=rowstart;i<=rowend;i++){
                map.add(matrix[i][colend]);
            }
            colend--;

            for(int i=colend;i>=colstart;i--){
                map.add(matrix[rowend][i]);

            }
            rowend--;

            for(int i=rowend;i>=rowstart;i--){
                map.add(matrix[i][colstart]);
            }
            colstart++;


        }

        return map;



    }

    public static int[][] spiralMatrixIII(int rows, int cols, int r_start, int c_start) {
        int[][] arr = new int[rows * cols][2];


        int count = 0;
        arr[count][0] = r_start;
        arr[count][1] = c_start;
        count++;
        int step=1;


        while (count != rows * cols ) {
            for (int i=0;i<step;i++){
                c_start++;
                if(r_start >= 0 && r_start < rows && c_start >= 0 && c_start < cols) {
                    arr[count][0] = r_start;
                    arr[count][1] = c_start;
                    count++;

                }



            }
            for (int i=0;i<step;i++){
                r_start++;
                if(r_start >= 0 && r_start < rows && c_start >= 0 && c_start < cols) {
                    arr[count][0] = r_start;
                    arr[count][1] = c_start;
                    count++;

                }



            }
            step++;
            for (int i=0;i<step;i++){
                c_start--;
                if(r_start >= 0 && r_start < rows && c_start >= 0 && c_start < cols) {
                    arr[count][0] = r_start;
                    arr[count][1] = c_start;
                    count++;

                }



            }
            for (int i=0;i<step;i++){
                r_start--;
                if(r_start >= 0 && r_start < rows && c_start >= 0 && c_start < cols) {
                    arr[count][0] = r_start;
                    arr[count][1] = c_start;
                    count++;

                }




            }
            step++;










        }
return arr;

    }

    public static int BS(int[] arr,int start,int end,double target){
        if(arr[0]<0){
            return 0;
        }
        if(arr[end]>=0){
            return end;
        }

        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                end=mid;

            }
            else{
                start=mid+1;
            }

        }
        return start;

    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        int x=0;
        for(int[] i:grid){
            x=BS(i,0,i.length-1,-0.1);
            count=count+(i.length-x);
        }
        return count;

    }




    public static int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        int max=arr[mid];


        if(arr[0]>arr[1]){
            return 0;
        }

        if(arr[end]>arr[end-1]){
            return end;
        }


        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }
            if(arr[mid+1]>arr[mid]){
                start=mid+1;


            }
            else {
                end=mid-1;

            }

        }
        return mid;
    }

    public static int binS(int[] arr,int target,int start,int end){
        int mid=0;

       while (start<=end){
           mid=start+(end-start)/2;

        if(target==arr[mid]){
            return mid;
        }
        if(arr[mid]>target){
            end=mid-1;
        }
        else {
            start=mid+1;
        }
        }
       return -1;

    }


    public static int search1(int[] nums, int target) {
        //finding pivot
        int start=0;
        int p_i=0;
        int end=nums.length-1;
        if(nums[start]<nums[end]){
            p_i=0;
            start=end+1;
        }
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                p_i= mid;
                break;
            }
            if(nums[mid-1]>nums[mid]){
                p_i=mid-1;
                break;
            }

            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        int res=binS(nums,target,0,p_i);
        if(res==-1){
            res=binS(nums,target,p_i+1,nums.length-1);
        }
        return res;

    }
    public static boolean search(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int p_i=0;
        if(nums[end]>nums[0]){
            p_i=end;
        }

        if(p_i==0) {


            while (start <= end) {
                mid = start + (end - start) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    p_i = mid;
                    break;
                }

                if (nums[mid - 1] > nums[mid]) {
                    p_i = mid - 1;
                    break;
                }

                if (nums[start] > nums[mid]) {
                    end = mid - 1;

                }
                if (nums[start] < nums[mid]) {
                    start = mid + 1;
                }

                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                    if (nums[start] > nums[start + 1]) {
                        p_i = start;
                        break;
                    }

                    if (nums[end] < nums[end - 1]) {
                        p_i = end - 1;
                        break;
                    }
                    start++;
                    end--;


                }
                if (nums[start] == nums[end] && nums[mid] > nums[end] || nums[start] < nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }


            }
        }
        int p=binS(nums,target,0,p_i);
        if(p_i!=1){
            return true;
        }else{
            p=binS(nums,target,p_i,end);
            if(p==-1){
                return false;
            }
            else {
                return true;
            }
        }




    }

    public static void main(String[] args){
        int[][] candies={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[] arr={4,7,0,1,2};
       System.out.println(search(arr,6));
        //String str="thequumpsoverthelazydog";
        //char v='a';
        //String x=Arrays.(candies);
        //addToArrayForm(candies,516);
       //spiralOrder(candies);
      //  System.out.println(countNegatives(candies));
        //System.out.println(peakIndexInMountainArray(arr));



       // System.out.println(findKthPositive(candies,7));



        //System.out.println(kidsWithCandies(candies,3));
        //System.out.println(numIdenticalPairs(candies));
        //System.out.println(ciel(candies,8));
        //char[] arr={'x','x','y','y'};
        //System.out.println(Arrays.toString(searchRange(candies, 1)));
        //System.out.println(Arrays.toString(smallerNumbersThanCurrent(candies)));
        //System.out.println(Arrays.toString(sortt(candies, 0, candies.length - 1)));
        //System.out.println(checkIfPangram(str));







    }

    private static int[] sortt(int[] candies, int start, int end) {
        if(start>=end){
            return candies;
        }

        int p_i=partitionn(candies,start,end);

        sortt(candies,start,p_i-1);
        sortt(candies,p_i+1,end);







        return candies;
    }

    private static int partitionn(int[] candies,int start,int end) {
        int count=0;
        int p=candies[start];
        int temp=0;

        for (int i=start;i<=end;i++){
            if(candies[i]<p){
                count++;
            }
        }
        temp=candies[start];
        candies[start]=candies[count+start];
        candies[count+start]=temp;



        int i=start;
        int j=end;
        while ( i<start+count && j>start+count){
            if(candies[i]<p){
                i++;
            }
            if(candies[j]>p){
                j--;
            }
            if( i<start+count && j>start+count){
                temp=candies[i];
                candies[i]=candies[j];
                candies[j]=temp;
            }

        }
        return  start+count;







    }
    public static boolean checkIfPangram(String sentence) {
        int[] arr=new  int[26];
        char[] carr=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            arr[carr[i]-'a']=1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }

    return true;}
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
int count=0;
for (int i=0;i<items.size();i++){

    for (int j=0;j<items.get(i).size();j++){
        if(ruleKey.equals("type")){
            if(ruleValue.equals(items.get(i).get(0))){
                count++;
            }
        }

        if(ruleKey.equals("color")){
            if(ruleValue.equals(items.get(i).get(1))){
                count++;
            }

        }
        if(ruleKey.equals("name")){
            if(ruleValue.equals(items.get(i).get(2))){
                count++;
            }

        }




    }
}





    return count;}
    public static int oddCells(int m, int n, int[][] indices) {
    int count=0;
    int[][] matrix=new int[m][n];

    for(int i=0;i<indices.length;i++){
        int r=indices[i][0];
        int c=indices[i][1];
        for (int j=0;j<n;j++){
            matrix[r][j]=matrix[r][j]+1;
        }
        for (int k = 0; k <m; k++){
           // matrix[r][k]=matrix[r][k]+1;
            matrix[k][c]=matrix[k][c]+1;
        }



        }
    for(int i =0;i<matrix.length;i++){
        for (int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]%2==1){
                count++;
            }
        }
    }
















    return count;}
}