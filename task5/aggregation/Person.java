package task5.aggregation;

public class Person {
    String name;
    Hat headSize;//пример агрегации

    Person (String name, Hat headSize){
        this.name = name;
        this.headSize = headSize;
    }

    public static void main(String[] args) {
        Hat hat = new Hat("green", 10);
        Person person = new Person("Smbd", hat);
        System.out.println("У шляпы мистера " + person.name + " размер номер " + hat.size);
    }
}
