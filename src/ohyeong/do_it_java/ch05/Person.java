package ohyeong.do_it_java.ch05;

public class Person {
    String name;      //이름
    float height;       //키
    float weight;

    public Person() { }

    public Person(String pname){
        name = pname;
    }

    Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }

}
