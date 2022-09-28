package randomn_practice;

import java.util.HashSet;

public class Practice {
    public static void main (String[] args)
    {
        int [] arr = {3,2,1,18,9};
        int target = 7;

        System.out.println(LS(arr, target, 0));


    }

    static boolean LS(int[] arr, int target, int index)
    {
        if(index == arr.length ) return false;
        return arr[index] == target || LS(arr, target, index + 1) ;
    }

    static boolean sorted(int[] arr, int i)
    {

        if(i == arr.length - 1) return true;

        return arr[i] < arr[i + 1] & sorted(arr,i + 1);
    }



}
