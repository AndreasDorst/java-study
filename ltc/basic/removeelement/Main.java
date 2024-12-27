package ltc.basic.removeelement;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(Solution.removeElement(nums, val)); // Expected 2
    }
}
