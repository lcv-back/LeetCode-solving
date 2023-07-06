import java.util.Arrays;

public class _Selection_Sort {
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find minimum from i to n-1
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 2, 7, 8, 1, 2 };
        selectionSort(a);
        System.out.println("a: " + Arrays.toString(a));
    }
}
