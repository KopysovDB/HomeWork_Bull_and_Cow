import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.FileReader;

public class ReadWriteFile {

    public static void addLogGameInfo(String randomStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date date = new Date(System.currentTimeMillis());
        String data = "\nGame № " + (Integer.parseInt(GameCount())+1) + " " + formatter.format(date) + " Загаданная строка " + randomStr;
        fileWrite(data);
    }

    public static void addLogTryInfo(String writtenStr, String CowBullInfo) {
        String data = "\nЗапрос: " + writtenStr + " Ответ: " + CowBullInfo;
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
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String GameCount() {
        ArrayList<String> GameStr = new ArrayList<>();
        try {
            File file = new File("gamelog.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if (line == null){
                    break;
                }
                if (line.contains("Game")){
                    GameStr.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] testSTR = GameStr.get(GameStr.size()-1).split(" ");

        return testSTR[2];
    }
}