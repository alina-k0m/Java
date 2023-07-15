package ex15_1;

import java.io.File;
import java.io.FilenameFilter;

//Просмотреть каталог файлов
class DirListOnly {
    public static void main(String args[]) {
        String dirname = "E:\\ALINA\\PICTURES\\Пейзажи";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("jpg");
        String s[] = f1.list(only);
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
