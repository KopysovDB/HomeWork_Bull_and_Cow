import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random_num = GenerateRandomString.str;
        System.out.println("исходное число: " + random_num);

        while (true){
            String entered_num = sc.nextLine();
            int bulls = Counter.cntBulls(entered_num, random_num);
            String str_Bulls = DeclinationWord.Correct_Word_Bull(bulls);
            int cows = Counter.cntCow(entered_num, random_num);
            String str_Cow = DeclinationWord.Correct_Word_Cow(cows);

            System.out.println(bulls + str_Bulls + cows + str_Cow);
        }
    }

}