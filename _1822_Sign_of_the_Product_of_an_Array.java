public class _1822_Sign_of_the_Product_of_an_Array {
    public static int arraySign(int[] nums) {
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                neg++;
            }
        }

        if (neg % 2 == 0) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82,
                70, 15, -41 };

        int x = arraySign(a);
        System.out.println("Product = " + x);
    }
}
