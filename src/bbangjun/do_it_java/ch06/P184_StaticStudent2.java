package bbangjun.do_it_java.ch06;

public class P184_StaticStudent2 {
    public static int serialNum=1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public P184_StaticStudent2(){
        serialNum++;
        studentID=serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName=name;
    }
}

class studentTest2{
    public static void main(String[] args) {
        P184_StaticStudent2 studentA = new P184_StaticStudent2();
        System.out.println(studentA.serialNum);
        System.out.println(P184_StaticStudent2.serialNum);

        P184_StaticStudent2 studentB = new P184_StaticStudent2();
        System.out.println(studentB.serialNum);
        System.out.println(P184_StaticStudent2.serialNum);
    }
}
// p186까지 함께 코드 작성
// 클래스 변수(static 변수) 내용