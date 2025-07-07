# Spring Boot User Management Demo

이 프로젝트는 Spring Boot와 JPA를 사용한 사용자 관리 시스템입니다.

## 기능

- 사용자 생성, 조회, 수정, 삭제 (CRUD)
- H2 인메모리 데이터베이스 사용
- RESTful API 제공
- 웹 인터페이스 제공

## 기술 스택

- Spring Boot 3.5.3
- Spring Data JPA
- H2 Database
- Thymeleaf
- Gradle

## 실행 방법

### 1. 프로젝트 빌드 및 실행

```bash
./gradlew bootRun
```

또는

```bash
./gradlew build
java -jar build/libs/spring-demo-0.0.1-SNAPSHOT.jar
```

### 2. 애플리케이션 접속

- 웹 인터페이스: http://localhost:8080/users
- H2 데이터베이스 콘솔: http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (비어있음)

## API 엔드포인트

### REST API

- `GET /api/users` - 모든 사용자 조회
- `GET /api/users/{id}` - 특정 사용자 조회
- `POST /api/users` - 새 사용자 생성
- `PUT /api/users/{id}` - 사용자 정보 수정
- `DELETE /api/users/{id}` - 사용자 삭제

### 예시 요청

#### 사용자 생성
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"name":"홍길동","email":"hong@example.com"}'
```

#### 모든 사용자 조회
```bash
curl http://localhost:8080/api/users
```

## 프로젝트 구조

```
src/main/java/com/example/demo/
├── User.java              # User 엔티티
├── UserRepository.java    # JPA Repository
├── UserService.java       # 비즈니스 로직
├── UserController.java    # REST API 컨트롤러
├── HelloController.java   # 웹 페이지 컨트롤러
├── DataLoader.java        # 초기 데이터 로더
└── SpringDemoApplication.java # 메인 애플리케이션

src/main/resources/
├── application.properties # 설정 파일
└── templates/
    ├── hello.html         # 기본 페이지
    └── users.html         # 사용자 관리 페이지
```

## 데이터베이스

- H2 인메모리 데이터베이스 사용
- 애플리케이션 시작 시 자동으로 테이블 생성
- 샘플 데이터 자동 로드 (김철수, 이영희, 박민수)

## 주요 특징

1. **JPA 엔티티**: `@Entity`, `@Id`, `@GeneratedValue` 어노테이션 사용
2. **Repository 패턴**: Spring Data JPA의 `JpaRepository` 상속
3. **서비스 계층**: 비즈니스 로직 분리
4. **REST API**: JSON 기반 API 제공
5. **웹 인터페이스**: 사용자 친화적인 웹 페이지
6. **데이터 초기화**: `CommandLineRunner`를 사용한 샘플 데이터 로드

## 개발 환경 설정

- Java 17 이상
- Gradle 7.x 이상
- IDE: IntelliJ IDEA, Eclipse, VS Code 등 