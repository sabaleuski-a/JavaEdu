package task5.composition;

public class Person extends Human {
    public void PersonStart(){
        Head PersonHead = new Head();   //реализация композиции
        PersonHead.say();
        PersonHead.eat();
    }
}
