
public class _976_Largest_Perimeter_Triangle {

    public static int largestPerimeter(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = a.length - 3; i >= 0; i--) {
            if (a[i] + a[i + 1] > a[i + 2]) {
                return a[i] + a[i + 1] + a[i + 2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums1[] = { 9, 7, 100, 33, 55, 999, 123 };
        System.out.println("Largest Perimeter = " + largestPerimeter(nums1));
    }
}