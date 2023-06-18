package ex5_1;
//Пример №5. Использование наследования класса Вох
//с импортом

import ex5.BoxWeight;

public class DemoSuper {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3f);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076f);
        BoxWeight mybox3 = new BoxWeight(); //по умолчанию
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        System.out.println("Объем mybox1 равен " + mybox1.volume());
        System.out.println("Bec mybox1 равен " + mybox1.getWeight());
        System.out.println();
        System.out.println("Объем mybox2 равен " + mybox2.volume());
        System.out.println("Bec mybox2 равен " + mybox2.getWeight());
        System.out.println();
        System.out.println("Объем mybox3 равен " + mybox3.volume());
        System.out.println("Bec mybox3 равен " + mybox3.getWeight());
        System.out.println();
        System.out.println("Объем myclone равен " + myclone.volume());
        System.out.println("Bec myclone равен " + myclone.getWeight());
        System.out.println();
        System.out.println("Объем mycube равен " + mycube.volume());
        System.out.println("Bec mycube равен " + mycube.getWeight());
        System.out.println();
    }
}
