package bbangjun.do_it_java.ch06;

class BirthDay{
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year=year;
    }

    public void printThis(){
        System.out.println(this);
    }
}
public class P170_ThisExample {
    public static void main(String[] args){
        BirthDay birthday = new BirthDay();
        birthday.setYear(2000);
        System.out.println(birthday);
        birthday.printThis();
    }
}
