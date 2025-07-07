package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // 기본 CRUD 메서드들은 JpaRepository에서 제공됩니다
    // 추가적인 쿼리 메서드가 필요하면 여기에 정의할 수 있습니다
    
    // 이메일로 사용자 찾기
    Optional<User> findByEmail(String email);
} 