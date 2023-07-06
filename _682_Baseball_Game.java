public class _682_Baseball_Game {
    public static int calPoints(String[] s) {
        int[] a = new int[s.length]; // Allocate heap memories
        int n = s.length, j = 0;
        a[0] = 0; // Always asign first element of array to avoid error array don't have nothing
        // Maybe, program record and calcalate score

        // Establish element of new integer array
        for (int i = 0; i < n; i++) {
            // Get element from string to character
            char c = s[i].charAt(0);

            /*
             * Check character at i postition is D: Record a new score that is the double of
             * the previous score.
             */
            if (c == 'D') {
                // If i is first element then don't have previous element to duplicate
                if (j == 0)
                    a[j] = 0;
                // j not chance

                else {
                    a[j] = a[j - 1] * 2;
                    j++;
                }

            }

            /*
             * Check character at i position is C: Invalidate the previous score, removing
             * it from the record.
             */
            else if (c == 'C') {
                // First element of array then don't have previous element to remove
                if (j == 0)
                    a[j] = 0;
                // j not chance

                else { // c != 0
                    a[j - 1] = -1; // -1 compatible was removed
                    j--; // j chanced j-1
                }

            }

            /*
             * Check character at i position is +: Record a new score that is the sum of the
             * previous two scores.
             */
            else if (c == '+') {
                if (j >= 2) {
                    // j can equal 1 and a[j] will be addition from a[j-1] with 0 (compatible
                    // a[j-2])
                    a[j] = a[j - 1] + a[j - 2];
                    j++;
                } else if (j == 1) {
                    a[j] = a[j + 1];
                    j++;
                }

            }

            // Case character is real interger
            else {
                // Convert string to integer
                int k = Integer.parseInt(s[i]); // c is character of s[i]
                // Record new score
                a[j] = k;
                // Increase index
                j++;

            }
        }

        // Function to sum elements of array
        int sum = 0;
        for (int i = 0; i < j; i++) {
            if (a[i] != -1) // Avoid element to removed
                sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] operation1 = { "5", "2", "C", "D", "+" };
        String[] operation2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        String[] operation3 = { "1", "C" };

        int result = calPoints(operation1);
        // Output: 30
        System.out.println("Result: " + result);

        result = calPoints(operation2);
        // Ouput: 27
        System.out.println("Result: " + result);

        result = calPoints(operation3);
        // Output: 0
        System.out.println("Result: " + result);
    }

}
