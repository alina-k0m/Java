package ex9;
/*Пример №9. Копирование файла. Чтобы воспользоваться программой,
укажите имена исходного и целевого файлов. Например, чтобы
        скопировать файл First.txt в файл Second.txt, введите в командной
        строке следующую команду: java CopyFile First.txt Second.txt*/

import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
//убедиться, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: CopyFile откуда куда");
            return;
        }
//копировать файл
        try {
//попытаться открыть файлы
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
            System.out.println("Копирование выполнено успешно!");
        } catch (IOException е) {
            System.out.println("Ошибка ввода-вывода: " + е);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException е2) {
                System.out.println("Ошибка закрытия файла ввода ");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException е2) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
