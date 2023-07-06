public class _136_Single_Number {
    public static int singleNumber(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
                count = 0;
                continue;
            } else {
                return a[i];
            }
        }
        return -1;
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
