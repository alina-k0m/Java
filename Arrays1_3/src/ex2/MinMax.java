package ex2;

//Пример №2. Нахождение минимального и максимального элемента массива

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 5;
        nums[3] = 18;
        nums[4] = -8;
        nums[5] = 623;
        nums[6] = 463;
        nums[7] = 9;
        nums[8] = -53453;
        nums[9] = 49;
        min = max = nums[0];
        for (int i = 0; i < 10; i++) {
            if (nums[i] < min) { //если iый элемент равен минимому, то это элемент = min
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("min & max: " + min + " & " + max);

        {
            for (int i = 0; i < nums.length; i++)
                System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Длина массива: " + nums.length);
        {
            for (int i = 9; i >= 0; i--) //массив в обратном порядке
                System.out.print(nums[i] + " ");
        }
    }
}
