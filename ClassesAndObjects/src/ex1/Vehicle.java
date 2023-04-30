package ex1;

/*Пример №1. Использование класса Vehicle. Присвойте файлу с
исходным кодом имя VehicleDemo.java*/
public class Vehicle {
    int pessengers;
    int fuelcap;
    int mpg; //потребление топлива в милях на галлон


    public int getPessengers() {
        return pessengers;
    }

    public void setPessengers(int pessengers) {
        this.pessengers = pessengers;
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


    public Vehicle(int pessengers, int fuelcap, int mpg) {
        this.pessengers = pessengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
}


