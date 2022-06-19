package bbangjun.do_it_java.ch06;

class Person2{
    String name;
    int age;

    Person2(){
        this("이름 없음", 1);
    }

    Person2(String name, int age){
        this.name=name;
        this.age=age;
    }

    Person2 returnItSelf(){
        return this;
    }
}

public class P173_CallAnotherCont {
    public static void main(String[] args) {
        Person2 noName=new Person2();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person2 p=noName.returnItSelf(); // 새로운 객체 p에 그대로 저장
        System.out.println(p);
        System.out.println(noName);
    }
}
