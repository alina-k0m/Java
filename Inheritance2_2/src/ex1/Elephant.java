package ex1;

public class Elephant extends Animal {
    int numberOfTusks;
    public Elephant () {super("", false, 4);} //конструктор, который обращается к классу на 1 ступень выше (class Animal)

    public Elephant(String eats, boolean vegetarian, int numberOfLegs) {
        super(eats, vegetarian, numberOfLegs);
        this.numberOfTusks = 0; //перегрузка конструктора
    }

    public Elephant(String eats, boolean vegetarian, int numberOfLegs, int numberOfTusks) {
        super(eats, vegetarian, numberOfLegs);
        this.numberOfTusks = numberOfTusks;
    }

    public int getNumberOfTusks() {
        return numberOfTusks;
    }

    public void setNumberOfTusks(int numberOfTusks) {
        this.numberOfTusks = numberOfTusks;
    }

    void showAllData() { //переопределяем метод
        super.showAllData();
        System.out.println(", количество бивней: "+numberOfTusks);
    }
}
