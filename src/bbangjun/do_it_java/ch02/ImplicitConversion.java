package bbangjun.do_it_java.ch02;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum=10; // byte형은 1byte이다.
        int iNum=bNum; // byte형이 int형으로 대입

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2=20;
        float fNum=iNum2; // int형이 float형으로 대입

        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum=fNum+iNum;
        System.out.println(dNum);

        int aNum=10;
        byte eNum=(byte)aNum; // 강제 형 변환
    }
}
