package bbangjun.do_it_java.ch07;

import java.util.ArrayList;

public class P227_ArrayListStudent {
    int studentID; // 학번
    String studentName; // 학생 이름
    ArrayList<P228_ArrayListSubject> subjectList; // subject 클래스에 대한 ArrayList 생성

    public P227_ArrayListStudent(int studentID, String studentName){ // Student 클래스 생성자
        this.studentID=studentID; // 학번 대입
        this.studentName=studentName; // 이름 대입
        subjectList=new ArrayList<P228_ArrayListSubject>(); // ArrayList 생성
    }

    public void addSubject(String name, int score){ // 과목 추가 메소드
        P228_ArrayListSubject subject = new P228_ArrayListSubject(); // Subject 객체 생성
        subject.setName(name); // setter로 과목 이름 저장
        subject.setScorePoint(score); // seetter로 성적 저장
        subjectList.add(subject); // 생성한 인스턴스를 subjectList에 추가함으로써 학생의 수강 과목 정보를 subjectList에 저장
    }

    public void showStudentInfo(){ // 각 과목의 성적과 총점 출력
        int total=0; // 총합
        for(P228_ArrayListSubject s : subjectList){ // subjectList 배열 요소 값을 순서대로 가져와 Subject 클래스의 객체 변수 s에 대입
            total+=s.getScorePoint();
            System.out.println("학생 "+studentName+"의 "+s.getName()+"과목 성적은 "+s.getScorePoint()+"입니다.");
        }
        System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
    }
}
