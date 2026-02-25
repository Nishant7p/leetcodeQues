class Solution {
    public int[] sortByBits(int[] arr) {
        int[] ans=new int[arr.length];
        int[] count=new int[arr.length];


        for(int i=0;i<arr.length;i++){
            int c=0;
            int n=arr[i];
            while(n>0){
                n=n&(n-1);
                c++;

            }
            count[i]=c;
        }
         for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){

                if(count[i] > count[j] || 
                  (count[i] == count[j] && arr[i] > arr[j])){

                    int tempCount = count[i];
                    count[i] = count[j];
                    count[j] = tempCount;

                   
                    int tempVal = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVal;
                }
            }
        }

    
        return arr;
        
    }
}
