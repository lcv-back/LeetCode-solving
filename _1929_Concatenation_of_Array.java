import java.util.Arrays;

public class _1929_Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (i >= 0 && i <= nums.length - 1) {
                result[i] = nums[i];
            } else { // i >= nums.length && i <= n-1
                int temp = i;
                temp = temp - nums.length;
                result[i] = nums[temp];
            }
        }

        System.gc();
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        // Output: [1,2,1,1,2,1];
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
