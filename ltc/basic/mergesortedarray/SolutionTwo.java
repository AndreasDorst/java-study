package ltc.basic.mergesortedarray;

public class SolutionTwo {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind1 = m - 1;
        int ind2 = n - 1;
        int indA = m + n - 1;

        while (ind1 >= 0 && ind2 >= 0) {
            nums1[indA--] = nums1[ind1] > nums2[ind2] ? nums1[ind1--] : nums2[ind2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, ind2 + 1);
    }
}
