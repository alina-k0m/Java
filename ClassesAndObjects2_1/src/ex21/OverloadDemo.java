package ex21;

public class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;
//Поочередно вызвать все версии метода sum()
        ob.sum();
        System.out.println();
        ob.sum(2);
        System.out.println();
        resI = ob.sum(4, 6);
        System.out.println("Результат вызова ob. sum(4, 6): " +
                resI);
        System.out.println();
        resD = ob.sum(1.1, 2.32);
        System.out.println("Результат вызова ob. sum(l.l, 2.32): "
                + resD);
    }
}
