package practice.corePractice2.dto;

import hello.core1.dto.Grade;

public class Member2 {
    //필드(멤버변수)
    private Long id;
    private String name;
    private Grade grade;

    //생성자
    public Member2(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //멤버 메서드
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


}
