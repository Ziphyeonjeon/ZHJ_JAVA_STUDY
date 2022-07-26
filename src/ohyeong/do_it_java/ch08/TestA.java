package ohyeong.do_it_java.ch08;

public class TestA {
    int num;

    void aaa(){
        System.out.println("aaa( ) 출력");
    }

    public static void main(String[] args) {
        TestA a1 = new TestA();
        a1.aaa();
        TestA a2 = new TestA();
        a2.aaa();
    }
}
