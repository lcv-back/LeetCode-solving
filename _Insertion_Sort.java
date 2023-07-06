import java.util.Arrays;

public class _insertionSort {
    public static void insertionSorting(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                // j compatible with i - 1 >= 0 => i >= 1
                // a[j] > temp => a[i-1] > a[i] => previouse element than current element
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 7, 8, 1, 2 };
        insertionSorting(a);
        System.out.println("a: " + Arrays.toString(a));
    }
}
