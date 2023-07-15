package ex0;
//Пример №0. Перенаправление потоков ввода-вывода

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new
                FileInputStream("C:\\Users\\Alina\\IdeaProjects\\InputOutput3_1\\src\\ex0\\input.txt");
//устанавливаем inputStream
        System.setIn(fileInputStream);
        byte[] fileData = System.in.readAllBytes();
        String s = new String(fileData);
        System.out.print(s); //печатаем считанную из файла строку
        /*-------------------------------------------------------*/
        FileOutputStream fileOutputStream = new
                FileOutputStream("C:\\Users\\Alina\\IdeaProjects\\InputOutput3_1\\src\\ex0\\server.log");
        {
//устанавливаем outputStream
            System.setOut(new PrintStream(fileOutputStream));
            System.out.println("Привет, Java\n");
//устанавливаем errorStream
            System.setErr(new PrintStream(fileOutputStream));
            System.err.write("Сообщение об исключении\n".getBytes());
        }
    }
}

