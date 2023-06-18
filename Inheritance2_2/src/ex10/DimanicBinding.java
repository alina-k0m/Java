package ex10;

public class DimanicBinding {
    public static Shape RandomShape(int i) {
        switch (i) {
            case 0:
                return new Shape();
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Triangle();
            case 4:
                return new Oval();
            default:
                return new Rect();
        }
    }

    public static void main(String[] args) {
        Shape[] firstArrShapes = new Shape[6];
        firstArrShapes[0] = new Shape();
        firstArrShapes[1] = new Rect();
        firstArrShapes[2] = new Circle();
        firstArrShapes[3] = new Square();
        firstArrShapes[4] = new Oval();
        firstArrShapes[5] = new Triangle();
        System.out.println("Последовательный массив фигур:");
        for (Shape s : firstArrShapes) s.draw();
        System.out.println();
//заполнение массива фигур случайным образом
        Shape[] secondArrShapes = new Shape[6];
        for (int i = 0; i < secondArrShapes.length; i++) {
            secondArrShapes[i] = RandomShape((int) (Math.random() * 6));
        }
        System.out.println("Случайный массив фугур:");
        for (Shape s : secondArrShapes) s.draw();
    }
}
