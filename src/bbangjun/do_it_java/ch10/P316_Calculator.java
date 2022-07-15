package bbangjun.do_it_java.ch10;

public abstract class P316_Calculator implements P314_Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
