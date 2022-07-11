package bbangjun.do_it_java.ch09;

import bbangjun.do_it_java.ch02.Constant;

public class P305_Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        P305_Constant cons = new P305_Constant();
        cons.num=50;
        // cons.NUM=200;

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}
