public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0, temp = 0, max = 0;

        for (int j = 0; j < accounts[0].length; j++) {
            max += accounts[temp][j];
        }

        for (int i = 1; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];

                if (max < sum)
                    max = sum;

            }
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int accounts[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        int temp = maximumWealth(accounts);
        System.out.println("Max = " + temp);
    }
}
