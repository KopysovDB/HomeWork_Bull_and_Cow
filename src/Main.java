import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String random_num = GenerateRandomString.str;
        System.out.println("исходное число: " + random_num);
        ReadWriteFile.addLogGameInfo(random_num);
        boolean round_flag = true;
        int countTry = 1;

        while (round_flag){
            String entered_num = sc.nextLine();
            int bulls = Counter.cntBulls(entered_num, random_num);
            String str_Bulls = DeclinationWord.Correct_Word_Bull(bulls);
            int cows = Counter.cntCow(entered_num, random_num);
            String str_Cow = DeclinationWord.Correct_Word_Cow(cows);
            ReadWriteFile.addLogTryInfo(entered_num, bulls + str_Bulls + cows + str_Cow);
            System.out.println(bulls + str_Bulls + cows + str_Cow);
            if (bulls == 4){
                System.out.println("Вы выйграли");
                ReadWriteFile.addLogWinInfo(String.valueOf(countTry));
                round_flag = false;
                }
            else countTry += 1;
            }
        }
    }