package ex16;

public class PassOb {
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
        System.out.println("ob1 имеет те же размеры, что и ob2: "
                + ob1.sameBlock(ob2));//Передача объека
        System.out.println("ob1 имеет те же размеры, что и ob3: "
                + ob1.sameBlock(ob3));//Передача объека
        System.out.println("ob1 имеет тот же объем, что и ob3: "
                + ob1.sameVolume(ob3));//Передача объека
    }
}
