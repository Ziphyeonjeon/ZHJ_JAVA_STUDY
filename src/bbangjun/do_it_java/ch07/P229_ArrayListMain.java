package bbangjun.do_it_java.ch07;

public class P229_ArrayListMain {
    public static void main(String[] args) {
        P227_ArrayListStudent studentKang = new P227_ArrayListStudent(2019202023, "Kang");
        studentKang.addSubject("국어", 100);
        studentKang.addSubject("수학", 100);

        P227_ArrayListStudent militaryKang = new P227_ArrayListStudent(20-71204318, "KangByeongJang");
        militaryKang.addSubject("화생방", 40);
        militaryKang.addSubject("3km 뜀걸음", 50);
        militaryKang.addSubject("사격", 60);

        studentKang.showStudentInfo();
        System.out.println("==================================================");
        militaryKang.showStudentInfo();
    }
}
