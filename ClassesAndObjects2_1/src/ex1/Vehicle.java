package ex1;

/*Пример №1. Использование класса Vehicle. Присвойте файлу с
исходным кодом имя VehicleDemo.java*/

public class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg;//потребление топлива в милях на галлон

    public void range() {
        System.out.println("Дaльнocть поездки транспортного средства " + fuelcap * mpg + " миль.");
//Обратите внимание на указание переменных fuelcap и mpg без использования точечной нотации
    }

    //Определить дальность поездки транспортного средства
    int rangeEx7() {
        return mpg * fuelcap;
    }
    //Рассчитать объем топлива, для преодоления заданного расстояния
    public double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers < 0) return;
        else this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    //В этом классе объявляется объект типа Vehicle
    class VehicleDemo {
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
}