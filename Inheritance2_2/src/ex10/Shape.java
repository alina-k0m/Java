package ex10;
//Пример №10. Переопределение метода суперкласса

import static java.lang.System.out;

public class Shape {
    void draw() {
        out.println("Shape.draw()");
    }

    void erase() {
        out.println("Shape.erase()");
    }
}

