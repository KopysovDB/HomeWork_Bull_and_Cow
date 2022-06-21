import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String random_num = generateRandomString();
        System.out.println("исходное число: " + random_num);
        Scanner sc = new Scanner(System.in);
        while (true){
            String entered_num = sc.nextLine();
            int bulls = cntBulls(entered_num, random_num);
            String declination_Bulls = Correct_Word_Bull(bulls);
            int cows = cntCow(entered_num, random_num);
            String declination_Cow = Correct_Word_Cow(cows);
            System.out.println(bulls + declination_Bulls + cows + declination_Cow);
        }
    }

    private static String generateRandomString() {
        int randomNumber = 1000 + ((int) (Math.random() * 10000) % 9000);
        String random_num_to_str = Integer.toString(randomNumber);
        while (checkReapitDigits(random_num_to_str)) {
            generateRandomString();
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
    private static int cntBulls (String random_num, String write_num){
        int counterBulls = 0;
        for (int i = 0; i < 4; i++){
            if (random_num.charAt(i) == write_num.charAt(i)){
                counterBulls += 1;
            }
        }
        return counterBulls;
    }
    private static int cntCow (String random_num, String write_num){
        int counterCow = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i != j){
                    if (random_num.charAt(i) == write_num.charAt(j)){
                        counterCow += 1;
                    }
                }
            }
        }
        return counterCow;
    }
    private static String Correct_Word_Bull (int count_bulls){
        String word = " быков ";
        if (count_bulls > 1 & count_bulls < 5){
            word = " быка ";
        } else if (count_bulls == 1) {
            word = " бык ";
        }
        return word;
    }
    private static String Correct_Word_Cow (int count_cow){
        String word = " коров";
        if (count_cow > 1 & count_cow < 5){
            word = " коровы";
        } else if (count_cow == 1) {
            word = " корова";
        }
        return word;
    }
}