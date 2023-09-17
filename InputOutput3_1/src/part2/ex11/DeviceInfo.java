package part2.ex11;
//Пример №11. Использования сериализации для сохранения объекта в файле

import java.io.Serializable;

public class DeviceInfo implements Serializable {
    private String name;
    private transient String description;
    private String article;

    public DeviceInfo(String name, String description, String
            article) {
        this.name = name;
        this.description = description;
        this.article = article;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(40);
        sb.append("Наименование : ");
        sb.append(this.name + "\n");
        sb.append("Описание : ");
        sb.append(this.description + "\n");
        sb.append("Модель : ");
        sb.append(this.article + "\n");
        return sb.toString();
    }
}

