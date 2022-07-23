package ohyeong.do_it_java.ch07;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[ ] strArray = {"Java", "Android", "C", "JavaScript", "Python"};

        for(String lang : strArray){
            System.out.println(lang);
        }
    }
}
