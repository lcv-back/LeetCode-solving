public class _1588_Sum_of_All_Odd_Length_Subarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 2; j < arr.length; j = j + 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[] = { 1, 4, 2, 5, 3 };
        int s = sumOddLengthSubarrays(a);
        System.out.println("Sum = " + s);
    }
}
