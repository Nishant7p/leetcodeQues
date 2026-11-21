class Solution {
    public int minRange(int a, int b, int c) {

        int ans=0;
        int[] arr={a,b,c};
        while(true){
            Arrays.sort(arr);
            if(arr[0]+arr[1]<arr[2]){
                arr[2]=arr[0]+arr[1];
                continue;
            }
            else{
                break;
            }


            
        }
        return arr[2]-arr[0];








        
        
    }
}