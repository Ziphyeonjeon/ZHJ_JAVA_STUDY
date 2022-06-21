package bbangjun.do_it_java.ch07;

public class P218_EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for(String lang:strArray){
            System.out.println(lang);
        }
    }
}
// String형 lang 변수에 strArray 배열 요소 값을 순서대로 가져와 대입