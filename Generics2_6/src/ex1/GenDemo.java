package ex1;

public class GenDemo {
    public static void main(String[] args) {
        Person<Integer> personIntegerID;
        personIntegerID = new Person<Integer>(223366);
        personIntegerID.showType();
        int personID = personIntegerID.getPersonID();
        System.out.println("Знaчeниe: " + personID);
        Person<String> personStringID = new Person<String>("22DD3366");
        personStringID.showType();
        System.out.println("Знaчeниe: " + personStringID.getPersonID());
    }
}
