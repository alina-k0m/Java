package ex7;

/*Пример №7. Добавление параметризированного метода, в котором
производится расчет объема топлива, необходимого транспортному
средству для преодоления заданного расстояния. ИЗМЕНИТЬ ПРОГРАММУ
ТАК, ЧТОБЫ УБРАТЬ ПРОМЕЖУТОЧНУЮ ПЕРЕМЕННУЮ GALLONS, А РЕЗУЛЬТАТ ЕЁ
ВЫПОЛНЕНИЯ ОСТАЛСЯ ПРЕЖНИМ*/

import ex1.Vehicle;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.setPassengers(7);
        minivan.setFuelcap(16);
        minivan.setMpg(21);

        sportscar.setPassengers(2);
        sportscar.setFuelcap(14);
        sportscar.setMpg(12);

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется "+ gallons + " галлонов топлива");
                gallons = sportscar.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется "+ gallons + " галлонов топлива");
    }
}
