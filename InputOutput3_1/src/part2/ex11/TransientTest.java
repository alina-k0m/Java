package part2.ex11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class TransientTest {
    public static void main(String[] args) throws Exception {
        DeviceInfo deviceInfo = new DeviceInfo("Iphone 8", "Описание качественных характеристик", " A1644");
// сериализация объекта
        ObjectOutputStream objectOutputStream = new
                ObjectOutputStream(new FileOutputStream("C:\\Users\\Alina\\IdeaProjects\\Java\\InputOutput3_1\\src\\part2\\ex11\\store.txt"));
        objectOutputStream.writeObject(deviceInfo);
        objectOutputStream.close();
// десериализация объекта
        ObjectInputStream OIS = new ObjectInputStream(new
                FileInputStream("C:\\Users\\Alina\\IdeaProjects\\Java\\InputOutput3_1\\src\\part2\\ex11\\store.txt"));
        deviceInfo = (DeviceInfo) OIS.readObject();
        System.out.println(deviceInfo);
    }
}
