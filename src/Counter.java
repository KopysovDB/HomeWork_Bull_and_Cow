public class Counter {

    public static int cntBulls (String random_num, String write_num){
        int counterBulls = 0;
        for (int i = 0; i < 4; i++){
            if (random_num.charAt(i) == write_num.charAt(i)){
                counterBulls += 1;
            }
        }
        return counterBulls;
    }
    public static int cntCow (String random_num, String write_num){
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
}