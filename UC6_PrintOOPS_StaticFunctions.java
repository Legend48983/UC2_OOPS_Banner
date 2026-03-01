public class UC6_PrintOOPS_StaticFunctions {

    // Build letter O
    public static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Build letter P
    public static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Build letter S
    public static String[] buildS() {
        return new String[]{
                "*****",
                "*    ",
                "*    ",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}