package ex1;
//Пример №1. Использование обобщенного класса

//Здесь Т обозначает параметр типа, который будет заменен реальным
//типом при создании объекта типа Person
public class Person <T>{
    T personID;

    public Person(T personID) {
        this.personID = personID;
    }

    public T getPersonID() {
        return personID;
    }

    void showType() {
        System.out.println("Типом Т явл. " + personID.getClass().getName());
    }
}
