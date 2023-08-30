public class _136_Single_Number {
    public int singleNumber(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
                count = 0;
                continue;
            } else {
                return a[i];
            }
        }
        System.gc();
        return -1;
    }
}
