public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int ai : nums) {
            insertionSort(maxArr, ai);
        }

        if (maxArr[2] != Long.MIN_VALUE)
            return (int) maxArr[2];
        return (int) maxArr[0];
    }

    private static void insertionSort(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (val > maxArr[i]) {
                break;
            } else if (val < maxArr[i]) {
                i++;
            } else {
                // val == maxArr[i]
                return;
            }
        }

        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 4, 1, 3, 6, 0 };
        int result = thirdMax(nums);

        System.out.println("Result: " + result);
    }
}
