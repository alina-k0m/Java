package ex3;

//Пример №3. Добавление метода range() в класс Vehicle

import ex1.Vehicle;

public class AddMeth {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
//Присвоить значения полям в объекте minivan
        int range1, range2;
        minivan.setPassengers(7);
        minivan.setFuelcap(16);
        minivan.setMpg(21);
//Присвоить значения полям в объекте sportscar
        sportscar.setPassengers(2);
        sportscar.setFuelcap(14);
        sportscar.setMpg(12);
        System.out.print("Мини-фypгoн может перевезти " +
                minivan.getPassengers() + " пассажиров. ");
        minivan.range();//отобразить дальность поездки мини-фургона
        System.out.print("Cпopтивный автомобиль может перевезти " +
                sportscar.getPassengers() + " пассажров. ");
        sportscar.range();//отобразить дальность поездки спортивного автомобиля
    }
}
