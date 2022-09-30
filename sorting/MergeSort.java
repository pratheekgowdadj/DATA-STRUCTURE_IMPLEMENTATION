package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
            int[] arr = {5,4,3,2,1};
             mergeSortInPlace(arr,0, arr.length );
            System.out.println(Arrays.toString(arr ));
    }

    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid ,arr.length));

        return merge(left,right);
    }

    static void mergeSortInPlace(int[] arr, int start, int end){
        if(end - start == 1) return ;

        int mid = (start + end) / 2;
         mergeSortInPlace(arr,start,mid);
         mergeSortInPlace(arr,mid,end);

         mergeInPlace(arr,start,mid,end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] res = new int[end - start];

        int i =start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end)
        {
            if(arr[i] < arr[j])
            {
                res[k] = arr[i];
                i++;
            }
            else{
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid)
        {
            res[k] = arr[i];
            i++;
            k++;
        }

        while(j < end)
        {
            res[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < res.length; l++) {
            arr[start + l] = res[l];
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];

        int i =0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                res[k] = left[i];
                i++;
            }
            else{
                res[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length)
        {
            res[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length)
        {
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}
