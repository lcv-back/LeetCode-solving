public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        // Hàm chính
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (countNumbers(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public static int countNumbers(int a) {
        int count = 0;
        int b;
        while (a != 0) {
            b = a % 10;
            count++;
            a /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 555, 901, 482, 1771 };
        System.out.println("Count = " + findNumbers(nums));

    }

    // Solution bài giải
    // B1: Cần đếm được số đó có bao nhiêu chữ số
    // B2: Lấy kết quả ở B1 để chia cho 2
    // Nếu B2 là chẵn thì đếm có bao nhiêu số như v
    // Nếu B2 là lẻ thì kh cần quan tâm
}