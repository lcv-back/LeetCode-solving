import java.util.Arrays;

public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int iL = 0, iR = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[iL] = nums[i];
                iL++;
            } else {
                result[iR] = nums[i];
                iR--;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        // Output: 2,4,3,1

        int[] result = sortArrayByParity(nums);

        System.out.println(Arrays.toString(result));
    }
}
