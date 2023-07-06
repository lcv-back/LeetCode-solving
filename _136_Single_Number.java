import java.util.Arrays;
public class _136_Single_Number {
    public static int singleNumber(int[] a) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            // Limit is length-2 because if all case is failure
            // Then value of last element is only one
            // Because don't have next element equal with last element
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        int[] arr = { 4, 1, 2, 1, 2 };

        int result = singleNumber(nums);
        System.out.println("Test Case 1: " + result);

        result = singleNumber(arr);
        System.out.println("Test Case 2: " + result);
    }
}
