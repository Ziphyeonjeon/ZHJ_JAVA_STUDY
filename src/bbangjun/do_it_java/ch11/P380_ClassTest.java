package bbangjun.do_it_java.ch11;

public class P380_ClassTest {
    public static void main(String[] args) throws ClassNotFoundException{ // forName() 메서드에서 발생하는 예외 처리 이름과 일치하는 클래스가 없는 경우 발생)
        P379_Person person = new P379_Person();
        Class pClass1 = person.getClass(); // Object의 getClass() 메서드 사용
        System.out.println(pClass1.getName());

        Class pClass2 = P379_Person.class; // 직접 class 파일 대입하기
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("bbangjun.do_it_java.ch11.P379_Person"); // 클래스 이름으로 가져오기
        System.out.println(pClass3.getName());
    }
}
