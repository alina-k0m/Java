package ex7;
//Пример №7. Отображение содержимого текстового файла.
/*Чтобы воспользоваться этой программой, укажите имя файла, который
требуется просмотреть. Например, чтобы просмотреть файл test.txt,
введите в командной строке следующую команду: java ShowFile
test.txt*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fileIn;
        InputStreamReader in;
        BufferedReader input;
        //убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Иcпoльзoвaниe: ShowFile имя_файла ");
            return;
        }
//Попытка открыть файл
        try {
            fileIn = new FileInputStream(args[0]);
//этот блок кода стоит использовать в случае, если кодировка по умолчанию
// не совпала с кодировкой JVM.ПОПРОБОВАТЬ САМОСТОЯТЕЛЬНО
            //in = new InputStreamReader(fileIn, StandardCharsets.UTF_8);
            input = new BufferedReader(new InputStreamReader(fileIn, "UTF-8"));
        } catch (FileNotFoundException е) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Неподдерживаемая кодировка");
            throw new RuntimeException(e);

        }
//Теперь файл открыт и готов к чтению. Далее из него читаются символы
// до тех пор, пока не встретится признак конца файла
        try {
            do {
                //i = in.read();
                i = input.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1); //файл считывается, пока i не равно -1
        } catch (IOException е) {
            System.out.println("Oшибкa чтения из файла");
        }
//закрыть файл
        try {
            fileIn.close();
        } catch (IOException е) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}
