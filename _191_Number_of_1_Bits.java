public class _191_Number_of_1_Bits {
    public static int hammingWeight(int n) {
        int count = 0, mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0)
                count++;
            mask = mask << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println("Hamming weight = " + hammingWeight(n));
    }
}
