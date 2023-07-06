import java.util.Arrays;

public class _912_Sort_an_Array {
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int[] mergeSort(int[] a, int L, int R) {
        int[] result;
        if (L == R) {
            // All element of array will be hash become array 1 element
            int[] singleElement = { a[L] };
            return singleElement;
        }

        else {
            int middle = (L + R) / 2;
            int[] leftHaft = mergeSort(a, L, middle);
            int[] rightHaft = mergeSort(a, middle + 1, R);

            result = mergeTwoSortedArray(leftHaft, rightHaft);
        }

        return result;
    }

    public static int[] mergeTwoSortedArray(int[] leftHaft, int[] rightHaft) {
        int allSize = leftHaft.length + rightHaft.length;
        int[] result = new int[allSize];
        int i = 0; // For array result
        int i1 = 0, i2 = 0; // a1 for left and a2 for right

        while (i < allSize) {
            if (i1 < leftHaft.length && i2 < rightHaft.length) {
                if (leftHaft[i1] <= rightHaft[i2]) {
                    result[i] = leftHaft[i1];
                    i++;
                    i1++;
                } else {
                    // leftHaft[i1] > rightHaft[i2];
                    result[i] = rightHaft[i2];
                    i++;
                    i2++;
                }
            } else {
                // leftHaft or rightHaft is empty
                if (i1 < leftHaft.length) {
                    result[i] = leftHaft[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = rightHaft[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -74, 48, -20, 2, 10, -84, -5, -9, 11, -24, -91, 2, -71, 64, 63, 80, 28, -30, -58, -11, -44, -87,
                -22, 54, -74, -10, -55, -28, -46, 29, 10, 50, -72, 34, 26, 25, 8, 51, 13, 30, 35, -8, 50, 65, -6, 16,
                -2, 21, -78, 35, -13, 14, 23, -3, 26, -90, 86, 25, -56, 91, -13, 92, -25, 37, 57, -20, -69, 98, 95, 45,
                47, 29, 86, -28, 73, -44, -46, 65, -84, -96, -24, -12, 72, -68, 93, 57, 92, 52, -45, -2, 85, -63, 56,
                55, 12, -85, 77, -39 };
        int[] result = sortArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
