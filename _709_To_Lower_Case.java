public class _709_To_Lower_Case {
    public static String toLowerCase(String s) {
        int n = s.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }

            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "LOVELY";
        String result = toLowerCase(s);
        System.out.println("String = " + result);
    }
}
