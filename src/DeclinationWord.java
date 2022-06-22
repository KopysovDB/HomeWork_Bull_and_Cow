public class DeclinationWord {
    public static String Correct_Word_Bull (int countBulls){
        String word = " быков ";
        if (countBulls > 1 & countBulls < 5){
            word = " быка ";
        } else if (countBulls == 1) {
            word = " бык ";
        }
        return word;
    }
    public static String Correct_Word_Cow(int countCow){
        String word = " коров";
        if (countCow > 1 & countCow < 5){
            word = " коровы";
        } else if (countCow == 1) {
            word = " корова";
        }
        return word;
    }
    public static String Correct_Word_Try(int countTry){
        String word = " попытку.";
        if (countTry >= 5){
            word = " попыток.";
        } else if (countTry > 1 & countTry < 5) {
            word = " попоытки.";
        }
        return word;
    }
}
