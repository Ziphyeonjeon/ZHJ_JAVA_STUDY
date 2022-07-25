package bbangjun.do_it_java.ch12.collection;

public class P407_Member {
    private int memberId;
    private String memberName;

    public P407_Member(int memberId, String memberName){
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
    public String toString(){
        return memberName + "회원님의 아이디는 "+memberId+"입니다"; // toString() 메서드 재정의
    }
}
