package ohyeong.do_it_java.ch07;

public class ArrayTest {
    public static void main(String[] args) {
        int[ ] num = new int[ ] {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int i=0; i<num.length; i++){
            sum += num[i];
            System.out.println(num[i]);
        }
        System.out.println(sum);
    }
}
