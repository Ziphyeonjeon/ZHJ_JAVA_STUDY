package bbangjun.do_it_java.ch05;

public class P144_Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args){
        P144_Student studentKang = new P144_Student();
        studentKang.studentName="강병준";

        System.out.println(studentKang.studentName);
        System.out.println(studentKang.getStudentName());
    }
}
