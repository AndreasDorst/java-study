package ltc.basic.removeduplicatesfromsortedarray;

public class SolutionTwo {
    public static int removeDuplicates(int[] nums) {
        int i = 0, k = 1;

        while (i < nums.length - 1) {
            if (nums[i++] < nums[i]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
