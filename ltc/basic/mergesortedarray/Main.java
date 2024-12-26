package ltc.basic.mergesortedarray;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n =3;

        SolutionTwo.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
