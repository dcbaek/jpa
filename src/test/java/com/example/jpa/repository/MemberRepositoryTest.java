package com.example.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@Rollback(value = false)
class MemberRepositoryTest {

    @Autowired
    TodoItemRepository memberRepository;

}