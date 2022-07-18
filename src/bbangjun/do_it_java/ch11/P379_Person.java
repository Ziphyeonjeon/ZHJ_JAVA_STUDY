package bbangjun.do_it_java.ch11;

public class P379_Person {
    private String name;
    private int age;

    public P379_Person(){}

    public P379_Person(String name){
        this.name=name;
    }

    public P379_Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}