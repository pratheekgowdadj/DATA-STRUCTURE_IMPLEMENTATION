import java.util.HashSet;

public class Practice {
    public static void main (String[] args)
    {
        int [] a = {2,1,3,4,5,6};
        if(sorted(a,0))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");

    }

    static boolean sorted(int[] arr, int i)
    {

        if(i == arr.length - 1) return true;

        return arr[i] < arr[i + 1] & sorted(arr,i + 1);
    }



}
