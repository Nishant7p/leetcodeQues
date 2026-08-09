class Solution {
    public double minPrice(int[] p, int[] d) {
        Arrays.sort(p);
        Arrays.sort(d);
        int i=p.length-1;
        int j=d.length-1;
        double sum=0; 


        while(i>=0&&j>=0){
            sum+=p[i]*(100-d[j])/100.0;
            i--;
            j--;

        }
        while(i>=0){
            sum+=p[i];
            i--;

        }


        return sum;


        
    }
}