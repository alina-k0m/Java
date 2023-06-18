package ex3;

//расширить класс Box, включив в него поле веса
class BoxWeight extends Box {
    float weight; //вес параллелепипеда

    // конструктор BoxWeight()
    BoxWeight(float width, float height, float depth, float weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        // = то же, что и super(width, height, depth);
        this.weight = weight;
    }
}
