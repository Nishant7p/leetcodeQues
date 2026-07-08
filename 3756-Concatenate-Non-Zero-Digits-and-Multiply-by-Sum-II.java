class Solution {
    long[] pow10;
    class Pair{
        long val;
        int cnt;
        int sum;
        public Pair(long val,int cnt,int sum){
            this.sum=sum;
            this.cnt=cnt;
            this.val=val;
        }

    }
    class Node {
            long val;
            int cnt;
            int sum;
            int start;
            int end;
            Node left;
            Node right;
            
            public Node(int s,int e){
                this.start=s;
                this.end=e;

            }
    }
    class STree{
        Node root;
        public STree(String s){
            pow10=new long[s.length()+1];
            pow10[0]=1;
            for(int i=1;i<pow10.length;i++){
                pow10[i]=(pow10[i-1]*10)%1000000007;
            }




            this.root=create(0,s.length()-1,s);
        }
        public Node create(int s,int e,String st){
            if(s==e){
                Node l= new Node(s,s);

                l.sum=st.charAt(s)-'0';
                l.val=st.charAt(s)-'0';
                if(st.charAt(s)=='0'){
                   l.cnt=0;

                } 
                else{
                    l.cnt=1;
                }
                return l;

            }
            int mid=s+(e-s)/2;
            Node x=new Node(s,e);
            x.left=create(s,mid,st);
            x.right=create(mid+1,e,st);
            x.sum=x.left.sum+x.right.sum;
            x.cnt=x.left.cnt+x.right.cnt;
            x.val=(((x.left.val*pow10[x.right.cnt])%1000000007+x.right.val)%1000000007);
            return x;
        }
        public Pair query(int l,int r){
            return helper(l,r,root);
        }
        public Pair helper(int l,int r, Node node){
            if(node.start>=l&&node.end<=r){
                return new Pair(node.val,node.cnt,node.sum);
            }


            if(node.end<l||node.start>r){
                return new Pair(0,0,0);
            }

            Pair L=helper(l,r,node.left);
             Pair R=helper(l,r,node.right);
            long vl=(((L.val*pow10[R.cnt])%1000000007+R.val)%1000000007);
             return new Pair(vl,L.cnt+R.cnt,L.sum+R.sum);
        } 
    }
    public int[] sumAndMultiply(String s, int[][] arr) {
        int m=s.length();
        STree tree=new STree(s);
        int[] ans=new int[arr.length];


        for(int i=0;i<ans.length;i++){
            int l=arr[i][0];
            int r=arr[i][1];

            Pair p=tree.query(l,r);
            long sum=p.sum;
            long nn=p.val;
            


            

        ans[i]=(int)(((sum%1000000007)*nn)%1000000007);

        }


        return ans;

        
    }
}