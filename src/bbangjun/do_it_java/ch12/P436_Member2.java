package bbangjun.do_it_java.ch12;

import java.util.Comparator;

public class P436_Member2 implements Comparator<P436_Member2> {
    private int memberId;
    private String memberName;

    public P436_Member2(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int compare(P436_Member2 mem1, P436_Member2 mem2){ // compare() 메서드 재정의. 전달받은 두 매개변수를 비교함함
       return mem1.getMemberId() - mem2.getMemberId();
    }
}
