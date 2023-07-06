import java.util.Arrays;

public class MergeSort {
    public static int[] sortArray(int[] nums) {
        System.gc();
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int[] mergeSort(int[] a, int l, int r) {
        int[] result;
        if (l > r)
            return new int[0];
        else if (l == r) {
            int[] singleElement = { a[l] };
            return singleElement;
        } else { // l < r
            int m = (l + r) / 2;
            int[] a1 = mergeSort(a, l, m);
            int[] a2 = mergeSort(a, m + 1, r);

            result = merge(a1, a2);
        }

        return result;
    }

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                // Both a1 & a2 not empty
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    // a2[i2] < a1[i1]
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                // One of these is empty
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    // i2 < a2.length
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 2, 1, 4 };
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
