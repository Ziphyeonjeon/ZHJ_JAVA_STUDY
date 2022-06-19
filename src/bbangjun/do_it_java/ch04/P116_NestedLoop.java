package bbangjun.do_it_java.ch04;

public class P116_NestedLoop {
    public static void main(String[] args) {
        int a, b;

        for(a=2; a<10; a++){
            for(b=1; b<10; b++){
                System.out.println(a+"x"+b+"="+a*b);
            }
        }
    }
}
