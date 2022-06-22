public class GenerateRandomString {

    public static String str = generaateString();
    private static String generaateString() {
        int randomNumber = 1000 + ((int) (Math.random() * 10000) % 9000);
        String random_num_to_str = Integer.toString(randomNumber);
        while (checkReapitDigits(random_num_to_str)) {
            generaateString();
        }
        return random_num_to_str;
    }

    private static boolean checkReapitDigits(String num) {
        for (int i = 0; i < num.length() - 1; i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
