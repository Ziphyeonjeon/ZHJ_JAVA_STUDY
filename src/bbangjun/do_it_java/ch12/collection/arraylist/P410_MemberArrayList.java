package bbangjun.do_it_java.ch12.collection.arraylist;

import bbangjun.do_it_java.ch12.collection.P407_Member;

import java.util.ArrayList;

public class P410_MemberArrayList {
    private ArrayList<P407_Member> arrayList; // ArrayList 선언

    public P410_MemberArrayList(){
        arrayList = new ArrayList<P407_Member>(); // Member형으로 선언한 ArrayList 생성
    }

    public void addMember(P407_Member member){ // ArrayList에 회원을 추가하는 메서드
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){
        for(int i=0; i<arrayList.size(); i++){
            P407_Member member = arrayList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId){ // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i); // 해당 회원을 삭제
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다"); // 반목문이 끝날 때까지 해당 아이디를 찾지 못한 경우 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거
        return false;
    }

    public void showAllMember(){ // 전체 회원을 출력하는 메서드
        for(P407_Member member : arrayList){
            System.out.println(member);
        }
        System.out.println( );
    }
}
