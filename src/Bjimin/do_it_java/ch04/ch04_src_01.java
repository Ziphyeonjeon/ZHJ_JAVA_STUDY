package Bjimin.do_it_java.ch04;

public class ch04_src_01 {
    public static void main(String[] args) {
        var num = 123;
        System.out.printf("제 학번은" + num + "번입니다.");

        var str = "gold";
        switch(str){
            case "silver":
                System.out.printf("2등"); break;
            case "gold":
                System.out.printf("1등"); break;
            case "bronze":
                System.out.printf("3등"); break;
            default: break;
        }
    }
}
