public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            insertToArray(ai, nums1, m);
            m++;
        }
    }

    private static void insertToArray(int ai, int[] nums1, int m) {
        boolean isChanged = false;
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] > ai) {
                isChanged = true;
                for (int j = nums1.length; j >= i; j--) {
                    nums1[j] = nums1[j - 1];
                }

                nums1[i] = ai;
            }

        }

        if (isChanged == false) {
            nums1[m] = ai;
        }
    }

    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 0, 0, 0 };
        int a2[] = { 2, 5, 6 };
        merge(a1, 3, a2, 3);

        System.out.println("Done");
    }

}
