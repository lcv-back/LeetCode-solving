public class _1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        int count = 0;
        for (int i = 1; i < salary.length; i++) {
            if (max < salary[i]) {
                max = salary[i];
            }
        }

        for (int i = 1; i < salary.length; i++) {
            if (min > salary[i]) {
                min = salary[i];
            }
        }

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            count++;
        }

        sum = sum - (max + min);

        sum = sum / (count - 2);
        return sum;
    }

    public static void main(String[] args) {
        // int salary1[] = { 4000, 3000, 1000, 2000 };
        int salary2[] = { 1000, 2000, 3000 };

        // System.out.println("Average 1 = " + average(salary1));
        System.out.println("Average 2 = " + average(salary2));
    }
}