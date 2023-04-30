package ex3;

//Пример №3. Демонстрация превышения границ массива

public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;
        for (i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
