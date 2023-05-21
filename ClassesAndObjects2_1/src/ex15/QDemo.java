package ex15;

public class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Иcпoльзoвaниe очереди bigQ для сохранения алфавита");
//Поместить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('А' + i));
        }
        //Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Coдepжмoe очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Иcпoльзoвaниe очереди smallQ для генерации ошибок");
//Использовать очередь smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Пoпыткa сохранения " + (char) ('z' -
                    i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
//Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Coдepжимoe smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
