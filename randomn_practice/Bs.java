package randomn_practice;

public class Bs    {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BS(arr,101,0,arr.length - 1));
    }

    private static int BS(int[] arr, int target, int s, int e) {

        //if(s > e) return -1;
        if (s <= e) {

            int m = s + (e - s) / 2;


            if (arr[m] == target) return m;

            else if (arr[m] > target) return BS(arr, target, s, m);

            else if(arr[m] < target) return BS(arr, target, m + 1, e);
        }
        return -1;
    }
}
