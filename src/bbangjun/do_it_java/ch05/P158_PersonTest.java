package bbangjun.do_it_java.ch05;

public class P158_PersonTest {
    public static void main(String[] args) {
        P157_Person personKang = new P157_Person();
        personKang.name = "강병준";
        personKang.weight = 99.9F;
        personKang.height = 185.0F;

        P157_Person personJun = new P157_Person("빵준", 188, 88);
    }
}
