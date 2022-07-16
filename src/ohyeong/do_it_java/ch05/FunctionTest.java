package ohyeong.do_it_java.ch05;

public class FunctionTest {
    public static void main(String[ ] args) {
        int num1 = 10;
        int num2 = 20;

        FunctionTest Add = new FunctionTest();
        int sum = Add.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
    }

    public int add(int n1, int n2) {
        int result = n1+ n2;
        return result;
    }
}
