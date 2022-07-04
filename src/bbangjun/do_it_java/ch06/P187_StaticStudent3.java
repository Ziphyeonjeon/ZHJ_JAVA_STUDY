package bbangjun.do_it_java.ch06;

public class P187_StaticStudent3 {
    private static int serialNum=1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public P187_StaticStudent3(){
        serialNum++;
        studentID=serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName=name;
    }

    public static int getSerialNum(){
        int i=10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum){
        P187_StaticStudent3.serialNum=serialNum;
    }
}

class studentTest3{
    public static void main(String[] args) {
        P187_StaticStudent3 studentLee = new P187_StaticStudent3();
        System.out.println(P187_StaticStudent3.getSerialNum());

        P187_StaticStudent3 studentPark = new P187_StaticStudent3();
        System.out.println(P187_StaticStudent3.getSerialNum());
    }
}