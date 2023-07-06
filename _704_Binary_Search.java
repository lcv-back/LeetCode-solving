public class _704_Binary_Search {
    public static int search(int[] a, int key) {
        int n = a.length;
        int iL = 0; // i at Left Position
        int iR = n - 1; // i at Right Position
        int iM = 0; // i at Middle Position

        while (iL <= iR) {
            iM = (iL + iR) / 2;

            if (a[iM] == key)
                return iM;
            else {
                if (a[iM] > key) {
                    iR = iM - 1;
                } else { // a[iM] < key
                    iL = iM + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 2;

        int result = search(nums, target);
        if (result != -1) {
            System.out.println(target + " exists in nums and its index is " + result);
        } else {
            System.out.println(target + " does not exist in nums so return -1");
        }
    }
}
