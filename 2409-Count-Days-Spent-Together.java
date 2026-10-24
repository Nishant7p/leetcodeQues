class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] m={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a=0,b=0,c=0,d=0;

        for(int i=0;i<Integer.parseInt(arriveAlice.substring(0,2))-1;i++) a+=m[i];
        a+=Integer.parseInt(arriveAlice.substring(3));

        for(int i=0;i<Integer.parseInt(leaveAlice.substring(0,2))-1;i++) b+=m[i];
        b+=Integer.parseInt(leaveAlice.substring(3));

        for(int i=0;i<Integer.parseInt(arriveBob.substring(0,2))-1;i++) c+=m[i];
        c+=Integer.parseInt(arriveBob.substring(3));

        for(int i=0;i<Integer.parseInt(leaveBob.substring(0,2))-1;i++) d+=m[i];
        d+=Integer.parseInt(leaveBob.substring(3));

        int l=Math.max(a,c);
        int r=Math.min(b,d);

        return Math.max(0,r-l+1);
    }

        
    }
