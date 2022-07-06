package bbangjun.do_it_java.ch08;

public class P254_TestA {
    int num;

    void aaa(){
        System.out.println("aaa() 출력");
    }

    public static void main(String[] args) {
        P254_TestA a1 = new P254_TestA();
        a1.aaa();
        P254_TestA a2 = new P254_TestA();
        a2.aaa();
    }
}
