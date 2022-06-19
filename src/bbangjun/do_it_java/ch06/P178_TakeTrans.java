package bbangjun.do_it_java.ch06;

public class P178_TakeTrans {
    public static void main(String[] args) {
        P175_Student studentJames = new P175_Student("James", 5000);
        P175_Student studentTomas = new P175_Student("Tomas", 10000);

        P177_Bus bus100 = new P177_Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        P177_Subway subwayGreen = new P177_Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();
    }
}
