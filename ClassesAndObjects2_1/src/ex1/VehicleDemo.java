package ex1;

public class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        int range;
//Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;//использование точечной нотации для доступа к переменным экземпляра
        minivan.mpg = 21;
//Рассчитать дальность поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Mини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
