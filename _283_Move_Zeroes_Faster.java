import java.util.Arrays;

public class _283_Move_Zeroes_with_Bubble_Sort {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i : nums) {
            if (i != 0)
                nums[index++] = i;
        }

        while (index != nums.length)
            nums[index++] = 0;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 3, 12 };
        int[] b = { 0 };

        moveZeroes(a);
        moveZeroes(b);

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
    }
}
