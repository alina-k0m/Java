package ex14;

//Пример №14. Использование некоторых методов класса String
public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер Интернета!";
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны.";
        int result, idx;
        char ch;
        System.out.println("Длинa str1: " + str1.length());
// Отобразить строку str1 посимвольно
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        //Проверка эквивалентности строк
        if (str1.equals(str2)) {
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 эквивалентна str3");
        } else {
            System.out.println("str1 не эквивалентна str3");
        }
        result=str1.compareTo(str3);
        if (result==0) {
            System.out.println("str1 и str3 равны");
        } else if (result < 0) {
            System.out.println("str1 меньше str3");
        } else {
            System.out.println("str1 больше str3");
        }
        //Присвоить переменной str2 новую строку
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Индeкc первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индeкc последнего вхожения One: " + idx);
    }
}
