package ex16;

//Пример №16. Использование передачи методам объектов
public class Block {
    int length, width, depth;
    int volume;

    public Block(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        volume = length * width * depth;
    }

    //Вернуть логическое значение true, если параметр ob определяет тот
    // же параллелепипед

    boolean sameBlock(Block ob) {//Использование объекта в качестве
        // параметра
        if ((ob.length == length) & (ob.width == width) &
                (ob.depth == depth)) {
            return true;
        } else {
            return false;
        }
    }

    //Вернуть логическое значение true, если параметр ob определяет
    // параллелепипед тогоже объема

    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}
