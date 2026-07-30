class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int x=n/8;
        if(x==0){
            return n;
        }
        if(x==1){
            return 8+(n%8)*2;
        }
        if(x==2){
            return 8+16+(n%8)*3;

        }

         if(x==3){
            return 8+16+24+(n%8)*4;

        }

        return 0;

        
    }
}