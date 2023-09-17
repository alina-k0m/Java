package part2.ex7;
////Пример №7. Использование класса BufferedWriter

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
    public static void main(String[] args) {
        long startTime, elapsedTime; // for speed benchmarking
        BufferedWriter bw = null;
        FileWriter fw = null;
        String mycontent = "Константин Бальмонт\r\n" +
                "Снежинка\r\n" +
                "Светло-пушистая, Снежинка белая,\r\n" +
                "Какая чистая, Какая смелая!\r\n" +
                "Дорогой бурною Легко проносится,\r\n" +
                "Не в высь лазурную, На землю просится.\r\n" +
                "Лазурь чудесную Она покинула,\r\n" +
                "Себя в безвестную Страну низринула.\r\n" +
                "\r\n" +
                "***\r\n" +
                "Афанасий Фет\r\n" +
                "\r\n" +
                "Кот поёт, глаза прищуря;\r\n" +
                "Мальчик дремлет на ковре.\r\n" +
                "На дворе играет буря,\r\n" +
                "Ветер свищет на дворе.\r\n" +
                "\"Полно тут тебе валяться, -\r\n" +
                "Спрячь игрушки да вставай!\r\n" +
                "Подойди ко мне прощаться,\r\n" +
                "Да и спать себе ступай\".\r\n" +
                "Мальчик встал, а кот глазами\r\n" +
                "Проводил и все поёт;\r\n" +
                "В окна снег валит клоками,\r\n" +
                "Буря свищет у ворот.\r\n" +
                "________________________\r\n" ;
        try { //Specify the file name and path here
            File file = new File("C:\\Users\\Alina\\IdeaProjects\\Java\\InputOutput3_1\\src\\part2\\ex7\\myfile.txt");
/* This logic will make sure that the file gets created
if it is not present at the specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            startTime = System.nanoTime(); //фиксируем текущее время (startTime) и замеряем результат в наносекундах (nanoTime)
            fw.write(mycontent);
            System.out.println("Время на запись с помощью FileWriter:" + (System.nanoTime() - startTime)+" nanosec ");
            System.out.println("Файл записан успешно");
            bw = new BufferedWriter(fw);
            startTime = System.nanoTime();
            bw.write(mycontent);
            System.out.println("Время на запись с помощью BufferedWriter:" + (System.nanoTime() - startTime)+" nanosec ");
            System.out.println("Файл записан успешно");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}
