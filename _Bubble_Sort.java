import java.util.Arrays;

public class _Bubble_Sort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isChanged = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isChanged = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            if (isChanged == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 3, 2, 7, 8, 1, 2 };
        bubbleSort(a);
        System.out.println("a: " + Arrays.toString(a));
    }
}
