package ex6;

//Пример №6. Присваивание ссылок на массивы
class AssignRef {
    public static void main(String args[]) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for (i = 0; i < nums1.length; i++) {nums1[i] = i;}
        for (i = 0; i < 10; i++) {nums2[i] = -i;}
        System.out.print("Maccив nums1: ");
        for (i = 0; i < 10; i++) {System.out.print(nums1[i] +" ");}
        System.out.println();
        System.out.print("Maccив nums2: ");
        for (i = 0; i < 10; i++) {System.out.print(nums2[i] +" ");}
        System.out.println();
        nums2 = nums1;//теперь обе переменные ссылаются на массив nums1
        System.out.print("Maccив nums2 после присваивания: ");
        for (i = 0; i < 10; i++) {System.out.print(nums2[i] +" ");}
        System.out.println();
        //Выполнить операции над массивом nums1 через переменную nums2
        nums2[3] = 99;
        System.out.print("Maccив nums1 после изменения через nums2: ");
        for (i = 0; i < 10; i++) {System.out.print(nums1[i] +" ");}
        System.out.println();
    }
}
