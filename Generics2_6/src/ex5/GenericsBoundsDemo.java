package ex5;

public class GenericsBoundsDemo {
    public static void main(String[] args) {
        Integer intNums[] = {1,2,3,4,5};
        Statistics<Integer> integerOb = new Statistics<Integer>(intNums);
        double sum = integerOb.average();
        System.out.println("Ср. значение integerOb = " + sum);
        Double doubleNums[]  = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> doubleOb = new Statistics<Double>(doubleNums);
        sum = doubleOb.average();
        System.out.println("Ср. значение doubleOb = " + sum);

        //Этот код не скомпилируется, так как класс String не является
        //производным от класса Number
/*        String strNums[] = {"1", "2", "3", "4", "5"};
        Statistics<String> stringOb = new Statistics<String>(strNums);
        sum = stringOb.average();
        System.out.println("Ср. значение strOb = " + sum);*/
    }
}
