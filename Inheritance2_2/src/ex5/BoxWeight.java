package ex5;

// Теперь в классе BoxWeight полностью реализованы все конструкторы
public class BoxWeight extends Box {
    float weight; //вес параллелепипеда

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //сконструировать клон объекта
    public BoxWeight(BoxWeight ob) {
        super(ob); //передать объект конструктору суперкласса
        this.weight = ob.weight;
    }

    //конструктор, применяемый при указании всех параметров
    public BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth); //вызвать конструктор суперкласса
        this.weight = weight;
    }

    //конструктор, применяемый по умолчанию
    public BoxWeight() {
        super(); //вызвать конструктор суперкласса
        weight = -1;
    }

    // конструктор, применяемый при создании куба
    public BoxWeight(float len, float wieght) {
        super(len); //вызвать конструктор суперкласса
        this.weight = weight;
    }
}
