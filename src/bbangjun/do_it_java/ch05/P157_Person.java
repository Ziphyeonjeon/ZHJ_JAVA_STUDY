package bbangjun.do_it_java.ch05;

public class P157_Person {
    String name;
    float height;
    float weight;

    public P157_Person(){}

    public P157_Person(String pname){
        name=pname;
    }

    public P157_Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}