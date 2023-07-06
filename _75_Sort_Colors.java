import java.util.Arrays;

public class _75_Sort_Colors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isChanged = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    isChanged = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            if (isChanged == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 0, 2, 1, 1, 0 };
        int[] b = { 2, 0, 1 };

        sortColors(a);
        sortColors(b);

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
    }
}
