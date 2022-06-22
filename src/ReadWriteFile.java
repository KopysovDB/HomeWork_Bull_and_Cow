import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadWriteFile {

    public static void addLogGameInfo(String randomStr) {
        SimpleDateFormat formatter= new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String data = "\nGame №"+"1 " + formatter.format(date) + " Загаданная строка " + randomStr;
        fileWrite(data);
    }

    public static void addLogTryInfo(String writtenStr, String CowBullInfo) {
        String data = "\nЗапрос: "+ writtenStr + " Ответ: " + CowBullInfo;
        fileWrite(data);
    }

    public static void addLogWinInfo(String tryCount) {
        String data = "\nСтрока была угадана за " + tryCount + DeclinationWord.Correct_Word_Try(Integer.parseInt(tryCount));
        fileWrite(data);
    }
    private static void fileWrite(String data) {
        String fileName = "gamelog.txt";
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File(fileName), true);
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
