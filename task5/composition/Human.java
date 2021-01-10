package task5.composition;

public class Human {
    private String name;
    private int age;
    public void HumanInfo(){
        System.out.println("Имя - "+ name + ",  возраст - " + age);
    }
    //set Human name
    public void setName(String name) {
        this.name = name;
    }
    //set Human age
    public void setAge(int age) {
        this.age = age;
    }
}
