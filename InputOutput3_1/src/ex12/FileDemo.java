package ex12;
//Пример №12. Использование некоторых методов из класса File

import java.io.File;
import java.util.Date;

public class FileDemo {
    private static String getFileExtension(File file) {
        String fileName = file.getName();
//если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".")
                != 0) {
//получаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt->txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        }
//иначе случае возвращаем «заглушку», то есть расширение не найдено
        else return "";
    }

    public static void main(String args[]) {
        File f1 = new File("C:\\Users\\Alina\\IdeaProjects\\InputOutput3_1\\src\\ex0\\input.txt");//указан относительный путь (анализируется относительно каталога приложения)
        System.out.println("Имя файла:" + f1.getName());
        System.out.println("Расширение:" + getFileExtension(f1));
        System.out.println("Путь:" + f1.getPath());
        System.out.println("Абсолютный путь:" + f1.getAbsolutePath());
        System.out.println("Родительский каталог:" + f1.getParent());
        System.out.println(f1.exists() ? "файл существует" : "файл не существует");
        System.out.println(f1.canWrite() ? "файл доступен для записи" : " не доступен для записи");
        System.out.println(f1.canRead() ? "файл доступен для чтения" : " не доступен для чтения");
        System.out.println(f1.isDirectory() ? "файл является каталогом" : " не является каталогом");
        System.out.println(f1.isFile() ? "файл является обычным файлом" : " может быть именованным каналом");
        System.out.println(f1.isAbsolute() ? "путь к файлу является абсолютным" : " путь к файлу не является абсолютным");
        System.out.println("Последнее изменение в файле:" + new Date(f1.lastModified()));
        System.out.println("Размер:" + f1.length() + " байт ");
    }
}
