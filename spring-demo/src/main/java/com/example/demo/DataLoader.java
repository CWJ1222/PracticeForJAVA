package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    private UserService userService;
    
    @Override
    public void run(String... args) throws Exception {
        // 샘플 사용자 데이터 생성 (비밀번호 포함)
        User user1 = new User("김철수", "kim@example.com", "1234");
        User user2 = new User("이영희", "lee@example.com", "1234");
        User user3 = new User("박민수", "park@example.com", "1234");
        
        // 데이터베이스에 저장
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);
        
        System.out.println("샘플 사용자 데이터가 로드되었습니다!");
        System.out.println("테스트 계정: kim@example.com / 1234");
    }
} 