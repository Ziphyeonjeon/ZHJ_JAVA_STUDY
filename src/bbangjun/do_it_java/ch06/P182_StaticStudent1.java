package bbangjun.do_it_java.ch06;

public class P182_StaticStudent1 {
    public static int serialNum=1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName=name;
    }
}

class StudentTest1 {
    public static void main(String[] args) {
        P182_StaticStudent1 student1=new P182_StaticStudent1();
        student1.setStudentName("이지원");
        System.out.println(student1.serialNum);
        student1.serialNum++;

        P182_StaticStudent1 student2=new P182_StaticStudent1();
        student2.setStudentName("손수경");
        System.out.println(student1.serialNum);
        System.out.println(student2.serialNum);
    }
}
