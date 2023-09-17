package ex15_1;
//Пример №15.1 Просмотр файлов в каталоге с необходимым расширением

import java.io.*;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(ext);
    }
//boolean accept(File dir, String name) - фильтрация фаайлов по именам
}

