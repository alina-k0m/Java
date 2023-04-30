package ex8;

//Пример №8. Использование класса Arrays для копирования массивов
import java.util.Arrays;
public class UseArrays {
    public static void main(String[] args) {
        System.out.println("Работа с одномерными массивами: ");
        float[] numbers = {1.1f, -2, -2.2f, 3.3f, 4.4f, -5.5f, 6};

        //копируем массив numbers
        System.out.println();
        float[] arrCopy = new float[numbers.length];
        System.out.println("Копия массива numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            arrCopy[i]= numbers[i];
            System.out.print(arrCopy[i] + " ");
        }
        System.out.println();
        System.out.println();
        //end копируем массив numbers

        float[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy)); //вывод массива. toString - конвертирует что-л. в строку
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
        numbersCopy = Arrays.copyOfRange(numbers, 2,6);//параметр from включительно, параметр to не включительно
        System.out.println(Arrays.toString(numbersCopy));
        System.out.println(numbers.equals(numbersCopy));
        System.out.println("Работа с двумерными массивами:");
        int[][] numbers2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers2DCopy = Arrays.copyOf(numbers2D,
                numbers2D.length);
        System.out.println("Равны ли эти двумерные массивы между собой?");
                System.out.println(Arrays.deepEquals(numbers2D,
                        numbers2DCopy));// сравнение двумерных массивов
        System.out.println(Arrays.deepToString(numbers2DCopy));//вывод на консоль двумерных массивов
    }
}
