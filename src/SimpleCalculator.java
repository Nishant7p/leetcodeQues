import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static int partition(int[] arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for (int i =start;i<=end;i++){
            if(pivot>arr[i]){
                count++;
            }
        }
        int p_i=start+count;
        int temp;
        temp=arr[start];
        arr[start]=arr[p_i];
        arr[p_i]=temp;

        int i=start;
        int j=end;

        while (i<p_i&&j>p_i){
            if(arr[i]<pivot){
                i++;


            }
            if (arr[j]>pivot){
                j--;
            }

            if (i<p_i&&j>p_i){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }





        }
        return p_i;












    }

    public  static void QS(int[] nums,int start,int end) {
        if(start>=end){
            return;
    }
    int p_i=partition(nums,start,end);
    QS(nums,start,p_i-1);
    QS(nums,p_i+1,end);
    }


    public static int[] Insertions(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            temp=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;


            }
            arr[j+1]=temp;







        }

        return arr;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        int[] re={3,2,1,5,9,4,6};
       // [2,7,11,15] i want re to be like this
        MS(re,0,re.length-1);
        ///QS(re,0, re.length-1);
        System.out.println(Arrays.toString(re));






}

    private static void MS(int[] re, int start, int end) {
        if(start<end){
            int mid=(start+end)/2;
            MS(re,start,mid);
            MS(re,mid+1,end);

            merges(re,start,end,mid);

        }



    }

    private static void merges(int[] re,int start,int end,int mid) {
        int[] left=new int[mid-start+1];
        int[] right=new int[end-mid];
        System.out.println(left.length);
        System.out.println(right.length);

        for (int i=0;i<left.length;i++){
            left[i]=re[start+i];
        }
        for (int i=0;i<right.length;i++){
            right[i]=re[mid+i+1];
        }

        int i=start;
        int j=0;
        int k=0;
        while (j<left.length&&k<right.length){
            if (left[j]<right[k]){
                re[i]=left[j];
                i++;
                j++;
            }
             else {
                re[i]=right[k];
                i++;
                k++;
            }




        }
        while (j<left.length){
            re[i]=left[j];
            i++;
            j++;
        }
        while (k<right.length){
            re[i]=right[k];
            i++;
            k++;
        }




        }


















    }
