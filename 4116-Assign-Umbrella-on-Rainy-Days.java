class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n=rain.length;
        String[] ans=new String[n];
        int alice=0;
        int bob=0;


        for(int i=0;i<n-1;i++){
            if(rain[i]==1&&rain[i+1]==1&&alice<=bob){
                alice++;
                ans[i]="Alice";

            }
            
            else if(rain[i]==1&&rain[i+1]==0){
                bob++;
                ans[i]="Bob";
            }
            else if(rain[i]==1&&rain[i]==1){
                bob++;
                ans[i]="Bob";
            }
            else{
                ans[i]="None";
            }




        }

        if(rain[n-1]==1){
            ans[n-1]="Bob";
        }
        else{
            ans[n-1]="None";
        }

        return ans;
        
    }
}