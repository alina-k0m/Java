package ex3;

//Пример №3. Использование наследования класса Box
class Box {
    float width;
    float height;
    float depth;

    //сконструировать клон объекта, передав объект конструктору
    Box(Box ob) { //копируем объект, копию потом изменяем
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, применяемый при указании всех размеров
    Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //конструктор, применяемый при отсутствии размеров
    Box() {
        width = -1;//значения - 1 обозначают неинициализированный параллелепипед
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    Box(float len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    float volume() {
        return width * height * depth;
    }
}

