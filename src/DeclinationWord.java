public class DeclinationWord {
    public static String Correct_Word_Bull (int count_bulls){
        String word = " быков ";
        if (count_bulls > 1 & count_bulls < 5){
            word = " быка ";
        } else if (count_bulls == 1) {
            word = " бык ";
        }
        return word;
    }
    public static String Correct_Word_Cow(int count_cow){
        String word = " коров";
        if (count_cow > 1 & count_cow < 5){
            word = " коровы";
        } else if (count_cow == 1) {
            word = " корова";
        }
        return word;
    }
}
