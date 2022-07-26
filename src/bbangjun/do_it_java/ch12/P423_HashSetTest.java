package bbangjun.do_it_java.ch12;

import java.util.HashSet;

public class P423_HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("임정순");
        hashSet.add(new String("박현정"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("강감찬"));
        hashSet.add("강감찬");

        System.out.println(hashSet);
    }
}
