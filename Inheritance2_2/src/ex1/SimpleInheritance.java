package ex1;

public class SimpleInheritance {
    public static void main(String args[]) {
        Animal animalOb = new Animal();
        Elephant elephantOb = new Elephant(); //вызыываем конструктор
//суперкласс может использоваться самостоятельно
        animalOb.name = "Собака"; //создаем объекты
        animalOb.vegetarian = false;
        animalOb.eats = "мясо";
        animalOb.numberOfLegs = 4;
        System.out.println("Coдepжимое объекта animalOb:");
        animalOb.showAllData();
        System.out.println();
        System.out.println();
//Подкласс имеет доступ ко всем открытым и защищенным элементам своего суперкласса
        elephantOb.name = "Индийский слон";
        elephantOb.vegetarian = true;
        elephantOb.eats = "трава";
        elephantOb.numberOfLegs = 4;
        elephantOb.numberOfTusks = 2;
        System.out.println("Coдepжoe объекта elephantOb:");
        elephantOb.showAllData();
    }
}
