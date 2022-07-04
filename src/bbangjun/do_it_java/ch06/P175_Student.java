package bbangjun.do_it_java.ch06;

public class P175_Student {
    public String studentName;
    public int grade;
    public int money;

    public P175_Student(String studentName, int money){
        this.studentName=studentName;
        this.money=money;
    }

    public void takeBus(P177_Bus bus) {
        bus.take(1000);
        this.money-=1000;
    }

    public void takeSubway(P177_Subway subway){
        subway.take(1500);
        this.money-=1500;
    }

    public void showInfo(){
        System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
    }
}
