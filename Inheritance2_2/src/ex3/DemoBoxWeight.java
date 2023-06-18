package ex3;

class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3f);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076f);
        float vol;
        vol = mybox1.volume(); //метод volume() выызываем из class Box, чтобы посчитать объем
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println(" Bec mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println(" Bec mybox2 равен " + mybox2.weight);
    }
}
