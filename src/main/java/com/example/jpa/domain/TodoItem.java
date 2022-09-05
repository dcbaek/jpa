package com.example.jpa.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity                 //jpa entity 로 선언
@Table(name="todos")    //table 정보
@Getter @Setter         //getter, setter 메소드
@NoArgsConstructor      //인자 없는 기본 생성자
@AllArgsConstructor     //모든 인자 가지는 생성자
@Builder                //빌더 패턴으로 생성하게 해줌.
public class TodoItem {
    @Id     //pk 필드. 반드시 필요,
    @Column(name="id", nullable = false)    //테이블 컬럼과 매핑
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Long id;

    @Column(name="title", nullable = false, length = 100)
    private String title;

    @Column(name="done", nullable = false)
    private boolean done;
}
