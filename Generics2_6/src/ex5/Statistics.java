package ex5;
//Пример №5. В этой версии класса Statistics аргумент типа Т должен
//быть классом Number или наследуемым от него классом
public class Statistics <T extends Number> {
    T[] numbersArray;

    public Statistics(T[] numbersArray) {
        this.numbersArray = numbersArray;
    }
    double average() {
        double sum = 0.0;
        for (T num:
             numbersArray) sum += num.doubleValue();
        return  sum / numbersArray.length;
    }
}
