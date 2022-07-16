package ohyeong.do_it_java.ch05;

public class StudentTest {
    public static void main(String[ ] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안승연";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());

        Student3 studentLee = new Student3();
        studentLee.setStudentName("이상원");
        System.out.println(studentLee.getStudentName());
    }
}
