class Solution {
    public boolean canAliceWin(int n) {
        int turn=0;
        int count=10;



        while(true){
            if(turn==0){
                turn=1;
                n=n-count;
                count--;
                if(n<0){
                    return false;
                }
                
            }
            else{
                turn=0;
                n=n-count;
                count--;
                if(n<0){
                    return true;
                }

            }

        }
        //return true;


        
    }
}