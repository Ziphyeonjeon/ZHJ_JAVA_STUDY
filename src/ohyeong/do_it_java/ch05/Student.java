package ohyeong.do_it_java.ch05;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println(studentID+","+address);  //이름, 주소 출력
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[ ] args) {
        Student studentAhn = new Student();
        studentAhn.studentName = "안연수";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
