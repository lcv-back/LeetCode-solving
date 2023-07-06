import java.util.Arrays;

public class quickSort {
    public static void quickSorting(int[] a, int L, int R) {
        if (L >= R)
            return;
        // B1: Select key
        int key = a[(L + R) / 2];

        // B2: Reallocate array by key
        int k = patition(a, L, R, key);

        // B3: Divide in 2 half
        quickSorting(a, L, k - 1);
        quickSorting(a, k, R);
    }

    // Return pivot value
    public static int patition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // with iL find element so big than or equal key
            while (a[iL] < key)
                iL++;
            while (a[iR] > key)
                iR--;

            // if (iL <= iR)
            int temp = a[iL];
            a[iL] = a[iR];
            a[iR] = temp;

            // if element bang nhau thi se lap vo tan
            iL++;
            iR--;
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 8 };
        quickSorting(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
import java.util.Arrays;

public class quickSort {
    public static void quickSorting(int[] a, int L, int R) {
        if (L >= R)
            return;
        // B1: Select key
        int key = a[(L + R) / 2];

        // B2: Reallocate array by key
        int k = patition(a, L, R, key);

        // B3: Divide in 2 half
        quickSorting(a, L, k - 1);
        quickSorting(a, k, R);
    }

    // Return pivot value
    public static int patition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // with iL find element so big than or equal key
            while (a[iL] < key)
                iL++;
            while (a[iR] > key)
                iR--;

            // if (iL <= iR)
            int temp = a[iL];
            a[iL] = a[iR];
            a[iR] = temp;

            // if element bang nhau thi se lap vo tan
            iL++;
            iR--;
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 4, 5, 8 };
        quickSorting(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
