public class _1502_Can_Make_Arithmetic_Progression_From_Sequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        bubleSort(arr);
        int x = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            x = arr[0] - arr[1];
            if (arr[i] - arr[i + 1] != x) {
                return false;
            }
        }
        return true;
    }

    public static void bubleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4 };

        boolean x = canMakeArithmeticProgression(arr);
        System.out.println("Result = " + x);
    }
}
