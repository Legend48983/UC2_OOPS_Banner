public class UC4_PrintOOPS_Array {

    public static void main(String[] args) {

        // Create array to store banner lines
        String[] banner = {

                String.join(" ", " *** ", " *** ", " *** ", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*   *", "**** "),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", " *** ", " *** ", " *** ", "*****")
        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}