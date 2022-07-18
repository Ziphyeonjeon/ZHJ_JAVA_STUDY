package bbangjun.do_it_java.ch11;

public class P364_HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i1 = new Integer(100); // abc 문자열의 해시 코드 값 출력
        Integer i2 = new Integer(100); // abc 문자열의 해시 코드 값 출력

        System.out.println(i1.hashCode()); // Integer(100)의 해시 코드 값 출력
        System.out.println(i2.hashCode()); // Integer(100)의 해시 코드 값 출력
    }
}
