package bbangjun.do_it_java.ch05;

public class P146_StudentTest {
    public static void main(String[] args) {
        P144_Student studentJun = new P144_Student();
        studentJun.studentName="Jun";

        System.out.println(studentJun.getStudentName());
        System.out.println(studentJun.studentName);
    }
}
// 같은 패키지 안에 있는 클래스는 사용 가능