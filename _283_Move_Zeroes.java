public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }

        for (int i = curIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1 };
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.printf(nums[i] + " ");
        }
    }
}
